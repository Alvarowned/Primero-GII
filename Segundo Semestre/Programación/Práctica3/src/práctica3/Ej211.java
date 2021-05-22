package práctica3;

import java.util.Arrays;
import java.util.Random;

public class Ej211 {

    public static Random rand = new Random();

    public static void main(String[] args) {
        int numeros[][] = new int[10][10], arr[] = new int[100];
        rand100arr(arr);
        Arrays.sort(arr);
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                numeros[i][j] =  arr[10*i+j];
                if(numeros[i][j]%2 == 0) System.out.print(numeros[i][j] + "p-");
                else System.out.print(numeros[i][j] + "i-");
            }
            System.out.println();
        }
        
    }

    public static void rand100arr(int arr[]) {
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(499) + 1;
        }
    }
}
