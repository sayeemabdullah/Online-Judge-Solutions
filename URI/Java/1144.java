import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
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
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
 
    }
 
}