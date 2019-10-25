import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int code1 = input.nextInt();
    int unit1 = input.nextInt();
    double price1 = input.nextDouble();
    int code2 = input.nextInt();
    int unit2 = input.nextInt();
    double price2 = input.nextDouble();
    double mix1 = unit1 * price1;
    double mix2 = unit2 * price2;
    double add = mix1 + mix2; 
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",add);     
    }
 
}