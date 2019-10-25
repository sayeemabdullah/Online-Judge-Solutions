import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    double B = input.nextDouble();
    double SUM = (A*3.5) + (B*7.5) ;
    double AVG = SUM/11;
    System.out.printf("MEDIA = %.5f\n",AVG );     
    }
 
}