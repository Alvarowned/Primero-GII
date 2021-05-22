#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>

#define N_COCHES 8

// Tipo de datos que representa un coche
typedef struct {
    int id;
    char *cadena;
} coche_t;

// Array de datos de tipo coche_t
coche_t Coches[N_COCHES];

//Variables ej 4.2.a
volatile int clasificacionFinal[N_COCHES];
volatile int finalCarrera=0;

// Inicializador del semáforo mutex
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
volatile int salida = 0;

// Funcion ejecutada por los hilos
void *funcion_coche(coche_t *pcoche)
{
	int aleatorio;
	unsigned int semilla = (pcoche->id) + getpid(); // Semilla generacion num. aleatorios

	printf("Salida de %s %d\n", pcoche->cadena, pcoche->id);

	pthread_mutex_lock(&mutex);	                // Entrada a primera sección crítica
	salida++;
	pthread_mutex_unlock(&mutex);	                // Salida de primera sección crítica

	fflush (stdout);

	while(salida != N_COCHES+1) {}

	aleatorio = rand_r(&semilla) % 10;             // Generar números aleatorios con funcion re-entrante rand_r()    
	
	sleep(aleatorio);

	pthread_mutex_lock(&mutex);                    // Entrada a segunda sección crítica

	printf("Llegada de %s %d\n", pcoche->cadena, pcoche->id);
	clasificacionFinal[finalCarrera] = pcoche->id;
	finalCarrera++;
	
	pthread_mutex_unlock(&mutex);                  // Salida de segunda sección crítica

	pthread_exit(NULL);
}


int main(void)
{
	pthread_t hilosCoches[N_COCHES];            // Tabla con los identificadores de los hilos	
	int i;

	printf("Se inicia proceso de creacion de hilos...\n\n");
	printf("SALIDA DE COCHES\n");

	for (i=0; i<N_COCHES; i++)                 // Se crean todos los coches e hilos
	{
		Coches[i] = (coche_t){i+1, "Coche"};
		pthread_create(&hilosCoches[i], NULL, (void*)&funcion_coche, (void*)&Coches[i]);
	}
	
	while(salida != N_COCHES){}         // Espera a que todos los hilos hayan salido
	printf("Proceso de creacion de hilos terminado\n\n");

	salida++;                      // No uso semáforos aqui porque sé que solo el hilo principal va a acceder en este momento a la variable global salida, y esto lo uso para dar la salida a los hilos

	for (i=0; i<N_COCHES; i++)          // El hilo principal espera a que terminen todo el resto de hilos
	{
		pthread_join(hilosCoches[i], NULL);
	}

	printf("Todos los coches han LLEGADO A LA META \n\n");

	pthread_mutex_destroy(&mutex);      // Destruye el semáforo mutex para liberar la memoria
     	
	printf("RANKING DE LA CARRERA: \n");
    	for (i=0; i<N_COCHES; i++)          // Imprime en pantalla la clasificación
	{
		printf("%dº - Coche %d\n", i+1, clasificacionFinal[i]);
	}

	return 0;
}
