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
    int A = input.nextInt();
    int B = input.nextInt();
    int SOMA = A + B ;
    System.out.println("SOMA = "+SOMA);     
    }
 
}