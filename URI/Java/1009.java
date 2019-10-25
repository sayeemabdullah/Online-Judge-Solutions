import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    String A = input.nextLine();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double D = C * 0.15;
    double TOTAL =B + D;
    System.out.printf("TOTAL = R$ %.2f\n",TOTAL );     
    }
}