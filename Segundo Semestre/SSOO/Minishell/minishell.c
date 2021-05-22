#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <signal.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <errno.h>

#include "internas.h"
#include "entrada_minishell.h"
#include "ejecutar.h"


static void manejar_sigchild(int signo){
	int estado;
	
	waitpid(-1, &estado, WNOHANG);                               /* Esta orden provoca que si un proceso padre tiene un proceso hijo en estado zombie,
	                                                                el proceso zombie hijo sea terminado. En estado se guardará el estado de salida
																	(exit status) del proceso zombie que haya terminado y si hay algún proceso hijo pero
																	sin terminar, se retornará un 0 en el estado  */
}

int main(int argc, char *argv[])
{
   	char buf[BUFSIZ];                                            /* Guarda el buffer en buf (lo que se escribe en el prompt) */
   	struct sigaction sa;
   	
   	memset(&sa, 0, sizeof(sa));
   	sa.sa_handler = manejar_sigchild;
   	sa.sa_flags = SA_NOCLDSTOP | SA_RESTART;
   	
   	sigaction(SIGCHLD, &sa, NULL);

 	while (1)
   	{
	   	imprimir_prompt();
	   	leer_linea_ordenes(buf);

	   	if (strcmp(buf, "exit") == 0) {                         /* Si se escribe 'exit', se termina el proceso */
		   	break;
	   	}
	   
	   	else {                                                  /* Se compara si es una orden interna o no */
		   	if (es_ord_interna(buf) == 1) {
			   	ejecutar_ord_interna(buf);
		   	}
		   	else {
			   	ejecutar_linea_ordenes(buf);
		   	}
	   	}
   	}
   	return 0;
}
