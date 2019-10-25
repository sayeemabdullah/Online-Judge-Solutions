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
      int T = input.nextInt();
      for(int i=1;i<=T;i++){
        int N = input.nextInt();
        long  l =0;
        long  m =1;
        long[] a = new long[61];
        a[0]=0;
        a[1]=1;
        if(N>1){
        for(int j=2;j<=N;j++){
        a[j]=l+m;
        long sum=a[j];
        l=m;
        m=sum;
        }
        }
        System.out.println("Fib("+N+") = "+a[N]);
      }
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}