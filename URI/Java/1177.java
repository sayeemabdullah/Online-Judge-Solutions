import java.util.Scanner;
import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
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
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
