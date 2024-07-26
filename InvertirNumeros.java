import java.util.Scanner;
import java.util.Arrays;
public class InvertirNumeros {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        int num = 8;
        int []numeros = new int [num];
        int [] inver = new int [num];

        for (int idx = 0; idx < numeros.length; idx++){
            System.out.println ("Ingresa los numeros: ");

            numeros [idx] = num.nextInt();
            for (int idx = 0; idx < numeros.length; idx++){
                inver [idx]= numeros [numeros.length -1 - idx];
        }
        System.out.println ("Original: "+Arrays.toString(numeros));
        System.out.println ("Invertido: "+Arrays.toString(inver));

        }
        
    }
}
