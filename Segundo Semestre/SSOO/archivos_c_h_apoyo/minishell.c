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
	
	waitpid(-1, &estado, WNOHANG);                               	                       /* Este m�todo provoca que si el proceso que lo ejecuta un proceso hijo en estado zombie, el proceso zombie
												  											  hijo sea terminado. En estado se guardar� el estado de salida (exit status) del proceso zombie que haya
												  											  terminado y si hay alg�n proceso hijo pero sin terminar (no zombie), se retornar� un 0 en el estado  */
}

int main(int argc, char *argv[])
{
   	char buf[BUFSIZ];                                            			       	/* Guarda el buffer en buf (la orden que se escribe en el prompt) */
   	struct sigaction sa;								       						/* Crea un nuevo Sigaction */
	char *orden, *token;								       						/* Punteros que hemos usado para el manejo de �rdenes compuestas */
   	
   	memset(&sa, 0, sizeof(sa));							       						/* Esta funci�n iguala todos los car�cteres del sigaction sa a '0', o lo que es eqivalente, lo pone a null
												  									   para poder volver a editarlo */

   	sa.sa_handler = manejar_sigchild;						       					/* Despu�s del memset, sa.sa_handler = manejar_sigchild hace que para sa el manejador que act�e cuando sea
												  									   detectado sea manejar_sigchild */

   	sa.sa_flags = SA_NOCLDSTOP | SA_RESTART;					       				/* Esta l�nea indica las flags de sa. SA_NOCLDSTOP indica que no se debe generar una se�al SIGCHLD cuando el
											          								   hijo se pare (o cuando contin�e cuando estaba parado). SA_RESTART indica que si una funci�n se interrumpe
												  									   por esta se�al no debe dar error, ya que si no la tuviese s� dar�a */
   	
   	sigaction(SIGCHLD, &sa, NULL); 							       					/* Esta funci�n indica que cuando se reciba la se�al SIGCHLD (que ser� cuando un hijo del proceso muera) se
												  									   ejecute el handler de sa (manejar_sigchild), el cual asegura que el hijo no quede zombie */

 	while (1)
   	{
	   	imprimir_prompt();							       /* Esta funci�n pone el prompt en pantalla */
	   	leer_linea_ordenes(buf);						       /* Esta funci�n lee la linea de �rdenes y pone lo escrito en buf */

		orden = strdup(buf);							       /* Con esta funci�n hemos hecho un duplicado de la l�nea de �rdenes, para no tener que trabajar directamente
												  con buf, ya que da error */

		while((token = strsep(&orden, ";")) != NULL) {				       /* Este while sirve para el control de �rdenes compuestas, va extrayendo de orden (que es un duplicado de 													  buf) todas las �rdenes que haya mientras est�n separadas por ';' */

		   	if ((strcmp(token, "exit") == 0) || (strcmp(token, " exit") == 0)) {   /* Si se escribe 'exit', se termina el proceso */
			   	exit(1);
		   	}
		   
		   	else {                                                  	       /* Se compara si es una orden interna o no, y la ejecuta en consecuencia */
			   	if (es_ord_interna(token) != 0) ejecutar_ord_interna(token);
			   	else ejecutar_linea_ordenes(token);
		   	}
 		}
   	}
   	return 0;
}
