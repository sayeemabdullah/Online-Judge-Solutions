import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      for(int i=1;i<=N;i++){
        int j=i*i;
        int k=j*i;
      System.out.println(i+" "+j+" "+k);
      System.out.println(i+" "+(j+1)+" "+(k+1));
      
      }
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}