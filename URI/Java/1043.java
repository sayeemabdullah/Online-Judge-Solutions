import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input=new Scanner(System.in);
    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = input.nextFloat();
    
    if((a+b)>c && (a+c)>b && (b+c)>a) {
    System.out.printf("Perimetro = %.1f\n",a+b+c);
    }
    else{
    System.out.printf("Area = %.1f\n",((a+b)/2)*c);
    }
    }
}