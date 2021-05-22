#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <string.h>

#include "parser.h"
#include "ejecutar.h"
#include "libmemoria.h"
#include "internas.h"
#include "redirecciones.h"

pid_t ejecutar_orden(const char *orden, int *pbackgr)
{
	char **args;
	pid_t pid;
	int indice_ent = -1, indice_sal = -1, entrada = 0, salida = 1; /* Por defecto, no hay < ni > */
	args = parser_orden(orden, &indice_ent, &indice_sal, pbackgr);
  	
	if ((args = parser_orden(orden, &indice_ent, &indice_sal, pbackgr)) == NULL) 
	{
		perror("ERROR EN EL PARSER DE LA ORDEN.\n");
		return(-1);                                         /* Tratamiento de errores para parser_orden, si falla retorna -1 */
	}
	if(indice_ent != -1){
		redirec_entrada(args, indice_ent, &entrada);	    /* Redirecciona la entrada */
	}
	if(indice_sal != -1){
		redirec_salida(args, indice_sal, &salida);	    /* Redirecciona la salida */
	}

	pid = fork();                                                /* Crea la minishell hija que ejecuta la orden */
	
	if(pid == -1){
		perror("ERROR CREANDO PROCESO (FORK).\n");           /* Corrección de errores */
		free_argumentos(args);			             /* Libera el espacio de memoria del comando args*/
		return(-1);
	}
	else if(pid != 0){                                           /* Sucede si es la minishell padre */
		free_argumentos(args);
		return pid;                                          /* Retorna el PID de su proceso hijo para después identificar al padre */
	}
	else{   						     /* Sucede si es la minishell hija */
		if(entrada != 0){
			dup2(entrada,STDIN_FILENO);                  /* Crea una copia de entrada y devuelve su identificador */ 
			close(entrada);                              /*Cierra la entrada después de que se realice el dup2 sobre ella*/
		}
		if(salida != 1){
			dup2(salida,STDOUT_FILENO);	             /* Crea una copia de salida y devuelve su identificador */ 
			close(salida);				     /* Cierra la salida después de realizar dup2 sobre ella*/
		}                                                
		if(execvp(args[0], args) == -1){
			perror("ERROR EJECUTANDO ORDEN.\n");
			exit(-1);                                    /* Si falla el POSIX 'exec()', la minishell hija envía el error y termina, así si la minishell padre está esperando a que su hija
								        					termine, puede continuar */
		}
	}
	return(-1);
}

void ejecutar_linea_ordenes(const char *orden)
{
	pid_t pid;
	int backgr;

	pid = ejecutar_orden(orden, &backgr);			     /*Ejecuta la orden que se ha aportado */
		
	if((backgr == 0) && (pid != 0)) wait(NULL);                  /* Si es el proceso padre y no existe símbolo de ejecución de la orden en background, el proceso padre espera a la finalización del
																	hijo */
}   
