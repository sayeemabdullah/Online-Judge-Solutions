import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    
    if (A<=0 || B<=0 || B<C)
    {
      System.out.println("Impossivel calcular");
    }
    else{
    double root = Math.sqrt((B*B)-(4*A*C));
    double R1 = (-B + root)/(2.0*A);
    double R2 = (-B - root)/(2.0*A);
    System.out.printf("R1 = %.5f\n",R1);
    System.out.printf("R2 = %.5f\n",R2);
    }
    }
}