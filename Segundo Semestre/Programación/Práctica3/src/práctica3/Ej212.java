package práctica3;

import java.util.Random;

public class Ej212 {
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        char letras[] = new char[50];
        int cont = 0;
        
        rand50char(letras);
        for(int i = 0; i < 50; i++){
            if(letras[i] == (char)97 || letras[i] == (char)101 || letras[i] == (char)105 || letras[i] == (char)111 || letras[i] == (char)117){
                cont += 1;
                System.out.println(letras[i] + " " + cont);
            }
        }
        System.out.println("Hay " + cont + " vocales en los 50 números generados aleatoriamente.");
    }
    
    public static void rand50char(char arr[]){
        for(int i = 0; i < 50; i++){
            arr[i] = (char)(rand.nextInt(26)+97);
        }
    }
}
