import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double pi = 3.14159;
    double R = input.nextDouble();
    double volume = (4.0/3) * pi * (R*R*R);
    
    System.out.printf("VOLUME = %.3f\n",volume);     
    }
 
}