import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double SUM = (A*2) + (B*3)+(C*5) ;
    double AVG = SUM/10;
    System.out.printf("MEDIA = %.1f\n",AVG );     
    }
 
}