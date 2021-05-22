CFLAGS=-Wall -g

#Incluye lo necesario para enlazar los objetos y la libreria y hacer el ejecutable de la minishell (esta la orden predeterminada del comando make)
minishell: minishell.o entrada_minishell.o ejecutar.o libmemoria.o redirecciones.o libshell.a
	gcc $(CFLAGS) minishell.o entrada_minishell.o ejecutar.o libmemoria.o redirecciones.o libshell.a -o minishell

#Incluye lo necesario para compilar y crear la libreria libshell
libshell.a: parser.o internas.o
	ar -rs libshell.a parser.o internas.o

#Incluye lo necesario para crear los objetos a partir de los archivos .c y los .h
minishell.o: minishell.c entrada_minishell.h internas.h ejecutar.h
	gcc $(CFLAGS) -c minishell.c

entrada_minishell.o: entrada_minishell.c entrada_minishell.h
	gcc $(CFLAGS) -c entrada_minishell.c

ejecutar.o: ejecutar.c ejecutar.h parser.h libmemoria.h parser.h redirecciones.h internas.h
	gcc $(CFLAGS) -c ejecutar.c

libmemoria.o: libmemoria.c libmemoria.h
	gcc $(CFLAGS) -c libmemoria.c

redirecciones.o: redirecciones.c redirecciones.h
	gcc $(CFLAGS) -c redirecciones.c

#Limpia todo lo creado por el make
clean: 
	rm minishell.o entrada_minishell.o ejecutar.o libmemoria.o redirecciones.o libshell.a minishell
