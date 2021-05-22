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
	
	waitpid(-1, &estado, WNOHANG);                               	                       /* Este método provoca que si el proceso que lo ejecuta un proceso hijo en estado zombie, el proceso zombie
												  											  hijo sea terminado. En estado se guardará el estado de salida (exit status) del proceso zombie que haya
												  											  terminado y si hay algún proceso hijo pero sin terminar (no zombie), se retornará un 0 en el estado  */
}

int main(int argc, char *argv[])
{
   	char buf[BUFSIZ];                                            			       	/* Guarda el buffer en buf (la orden que se escribe en el prompt) */
   	struct sigaction sa;								       						/* Crea un nuevo Sigaction */
	char *orden, *token;								       						/* Punteros que hemos usado para el manejo de órdenes compuestas */
   	
   	memset(&sa, 0, sizeof(sa));							       						/* Esta función iguala todos los carácteres del sigaction sa a '0', o lo que es eqivalente, lo pone a null
												  									   para poder volver a editarlo */

   	sa.sa_handler = manejar_sigchild;						       					/* Después del memset, sa.sa_handler = manejar_sigchild hace que para sa el manejador que actúe cuando sea
												  									   detectado sea manejar_sigchild */

   	sa.sa_flags = SA_NOCLDSTOP | SA_RESTART;					       				/* Esta línea indica las flags de sa. SA_NOCLDSTOP indica que no se debe generar una señal SIGCHLD cuando el
											          								   hijo se pare (o cuando continúe cuando estaba parado). SA_RESTART indica que si una función se interrumpe
												  									   por esta señal no debe dar error, ya que si no la tuviese sí daría */
   	
   	sigaction(SIGCHLD, &sa, NULL); 							       					/* Esta función indica que cuando se reciba la señal SIGCHLD (que será cuando un hijo del proceso muera) se
												  									   ejecute el handler de sa (manejar_sigchild), el cual asegura que el hijo no quede zombie */

 	while (1)
   	{
	   	imprimir_prompt();							       /* Esta función pone el prompt en pantalla */
	   	leer_linea_ordenes(buf);						       /* Esta función lee la linea de órdenes y pone lo escrito en buf */

		orden = strdup(buf);							       /* Con esta función hemos hecho un duplicado de la línea de órdenes, para no tener que trabajar directamente
												  con buf, ya que da error */

		while((token = strsep(&orden, ";")) != NULL) {				       /* Este while sirve para el control de órdenes compuestas, va extrayendo de orden (que es un duplicado de 													  buf) todas las órdenes que haya mientras estén separadas por ';' */

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
