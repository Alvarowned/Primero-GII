#include <stdio.h>
#include <math.h>

void main(){
	double x1, y1, x2, y2, dist;
	
	printf("Introduzca X1 e Y1: ");
	scanf("%lf %lf", &x1, &y1);
	printf("Introduzca X2 e Y2: ");
	scanf("%lf %lf", &x2, &y2);
	
	dist = sqrt(pow(x1 - x2,2) + pow(y1 - y2,2));
	
	printf("La distancia entre los dos puntos es de %lf uds.", dist);
}
