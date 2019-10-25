import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int code = input.nextInt();
    double quantity = input.nextDouble();
    double price=0;
    if (code == 1) {
      price = 4 * quantity ;
    }
    else if(code == 2) {
      price = 4.50 * quantity ;
    }
    else if(code == 3) {
      price = 5 * quantity ;
    }
    else if(code == 4) {
      price = 2 * quantity ;
    }
    else if(code == 5) {
      price = 1.5 * quantity ;
    }
    System.out.printf("Total: R$ %.2f\n",price);
    }
}