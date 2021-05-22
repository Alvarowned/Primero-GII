#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#include "entrada_minishell.h"

void imprimir_prompt()
{
   printf("minishell> ");                    /* mostrar en pantalla la cadena que servir� de prompt: entrada de �rdenes en la consola */
   fflush(stdout);                           /* vac�a el buffer intermedio de salida y se env�a el texto a la pantalla */
}

void eliminar_salto_linea(char *cad)
{
   int i, longitud;

   longitud = strlen(cad);                   /* cad es una cadena de caracteres con la orden le�da.*/

   for(i = longitud-1; i >= 0; i--)          /* se busca el car�cter de final de l�nea introducido por fgets y se sustituye por '\0' para indicar el final de orden */
      if (cad[i] == '\n')         
      {
          cad[i] = 0;
          break;
      }
}
       
void leer_linea_ordenes(char *buf)
{
    
   memset(buf, 0, sizeof(BUFSIZ));

   if (fgets(buf, BUFSIZ-1, stdin) == NULL)  /* fgets almacena la orden le�da introduciendo tambi�n el car�cter de fin de l�nea */
   { 
      buf[0] = '\0';
      return;
   }

   eliminar_salto_linea(buf);  
}

