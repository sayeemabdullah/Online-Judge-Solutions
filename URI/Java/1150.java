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
    int X = input.nextInt();
    int Z = input.nextInt();
    int sum=1;
    int number = X;
    while(X>=Z){
    Z = input.nextInt();
    }
    for(int count=1;count>0;count++){
    number = number + (X+count);
    sum++;
    if(number>Z){
    break;
    }
    }
    System.out.println(sum);
    }
 
}