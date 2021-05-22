#include <stdio.h>

void main(){
	int x;
	float array[10][2];
	scanf("%d", &x);
	array[0][0] = (float)x;
	printf("%f, %d", array[0][0], x);
}
