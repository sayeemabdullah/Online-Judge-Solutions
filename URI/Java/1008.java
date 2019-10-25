import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    double C = input.nextDouble();
    double E= B*C;
    System.out.println("NUMBER = "+A);
    System.out.printf("SALARY = U$ %.2f\n",E);
    }
 
}