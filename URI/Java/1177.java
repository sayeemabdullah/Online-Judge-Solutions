import java.util.Scanner;
import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
      int[] a = new int [1000];
      int T=input.nextInt();
      for(int i=0;i<a.length;i++){
        for(int j=0;j<T;j++){
          if(i>=a.length){
          break;
          }
          if(j==T-1){
        System.out.println("N["+i+"] = "+j);
          }
          else{
          System.out.println("N["+i+"] = "+j);
        i++;
          }
        }
      }
    }
}
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
