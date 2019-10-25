import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2= input.nextDouble();
    double X = (x2 - x1) * (x2 - x1);
    double Y = (y2 - y1) * (y2 - y1);
    double Z = X + Y ;
    double root = Math.sqrt(Z);
    System.out.printf("%.4f\n",root);
    
    }
}