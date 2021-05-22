#include <stdlib.h>

#include "libmemoria.h"

/* Función que libera el espacio de memoria asignado a los argumentos del comando ingresado */

void free_argumentos(char **args)
{
   	int i = 0;

   	while(args[i]) 
      	free(args[i++]); 								/* Se liberaran los punteros de direccion asiganados al arreglo args */
   	free(args);
}

/* Función que libera el espacio de almacenamiento asignado a las ordenes dadas */

void free_ordenes_pipes(char **ordenes, int **fds, int nordenes)
{
   	int i = 0;

   	for (i = 0; i < nordenes; i++)
   	{
   	   	free(ordenes[i]); 								/* Se libera el espacio de memoria asignado para cada puntero en ordenes */ 
      	if (i < (nordenes - 1))
        free(fds[i]); 									/* Se liberará el puntero del espacio de memoria en fds antes de llegar a la última orden */
   	}

   	free(ordenes); 										/* Libera el espacio de memoria asignado al puntero de ordenes */
   	free(fds); 											/* Libera el espacio de memoria asignado al puntero de fds */
}
