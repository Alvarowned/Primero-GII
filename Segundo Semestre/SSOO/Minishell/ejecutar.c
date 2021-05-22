#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <string.h>

#include "parser.h"
#include "ejecutar.h"
#include "libmemoria.h"
#include "internas.h"


pid_t ejecutar_orden(const char *orden, int *pbackgr)
{
	char **args;
	pid_t pid;
	int indice_ent = -1, indice_sal = -1; /* por defecto, no hay < ni > */
  	
	if ((args = parser_orden(orden, &indice_ent, &indice_sal, pbackgr)) == NULL) 
	{
		printf("ERROR EN EL PARSER DE LA ORDEN.\n");
		return(-1);                                  /* Tratamiento de errores para parser_orden, si falla retorna -1 */
	}


   	/* Si la linea de ordenes posee tuberias o redirecciones, podra incluir */
   	/* aqui, en otras fases de la practica, el codigo para su tratamiento.  */


	pid = fork();                                      /* Crea la minishell hija que ejecuta la orden */

	if(pid == -1){
		printf("ERROR CREANDO PROCESO (FORK).\n");     /* Corrección de errores */
		free_argumentos(args);
		return(-1);
	}
	else if(pid != 0){                                 /* Sucede si es la minishell padre */
		free_argumentos(args);
		return pid;                                    /* Retorna el PID de su proceso hijo para después identificar al padre */
	}
	else{                                              /* Sucede si es la minishell hija */
		if(execvp(args[0], args) == -1){
			printf("ERROR EJECUTANDO ORDEN.\n");
			exit(-1);                                  /* Si falla el POSIX 'exec()', la minishell hija envía el error y termina, así si la minishell padre está esperando a que su hija termine, puede continuar */
		}
	}
	return(-1);
}
 
void ejecutar_linea_ordenes(const char *orden)
{
	pid_t pid;
	int backgr;
	char *r = strdup(orden), *token;                              /* Creamos r que es un puntero a un duplicado de orden */


	while(r != '\0') {
		token = strsep(&r, ";");                                  /* Separamos orden en tokens, para ejecutar las órdenes separadas por el carácter ";" */
		if (es_ord_interna(token) == 1) {                         /* Para poder ejecutar órdenes internas cuando sea una orden múltiple también */
			pid = 0;			
			backgr = 0;
			ejecutar_ord_interna(token);
		} else { 
			pid = ejecutar_orden(token, &backgr);
			if((backgr == 0) && (pid != 0)) wait(NULL);               /* Si es el proceso padre y no existe símbolo de ejecución de la orden en background, el proceso padre espera a la finalización del hijo */
		}
	}
	free(r);                                                      /* Liberamos r */
}   
