#include <stdio.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <stdlib.h>
#include <fcntl.h>


/* Funcion que abre el archivo situado en la posicion indice_entrada + 1 
   de la orden args y elimina de ella la redireccion completa */
                                  
void redirec_entrada(char **args, int indice_entrada, int *entrada)
{
	*entrada = open(args[indice_entrada+1], O_RDONLY); /* Asigna en la variable entrada el entero descriptor de abrir el archivo (solo con permisos de lectura) */
	if(*entrada == -1){
		perror("ERROR CON EL ARCHIVO DE LA REDIRECCIÓN DE ENTRADA\n");
	}else{                                             /* Las posiciones correspondientes a "<" y al nombre del archivo son igualadas a null para que se pueda ejecutar correctamente el comando */
		args[indice_entrada+1]=NULL;
		args[indice_entrada]=NULL;
	}
}

/* Funcion que abre el archivo situado en la posicion indice_salida + 1
   de la orden args y elimina de ella la redireccion completa */

void redirec_salida(char **args, int indice_salida, int *salida)
{
   	FILE *file;
	              
	file = fopen(args[indice_salida+1],"w");             /* Crea un archivo con el nombre del archivo introducido, en el caso de existir, es borrado su contenido */
	fclose(file);

	*salida = open(args[indice_salida+1], O_RDWR);       /* Asigna en la variable salida el entero descriptor de abrir el archivo (con los permisos de lectura y escritura) */
	args[indice_salida+1]=NULL;                          /* Las posiciones correspondientes a ">" y al nombre del archivo son igualadas a null para que se pueda ejecutar correctamente el comando */
	args[indice_salida]=NULL;
}

