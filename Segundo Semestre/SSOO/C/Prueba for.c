#include<stdio.h>

void imprimir(){
	int var;
	
	for(var = 0; var < 5; var++){
		printf("Numero %d\n", var);
	}
}




int main(){
	char cadena[] = "hola";
	
	imprimir();
	printf("%s", cadena);
	
	return 0;
}
