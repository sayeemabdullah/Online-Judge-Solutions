import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    System.out.println(x);
    int temp = x%100;
    System.out.println(x/100 + " nota(s) de R$ 100,00");
    System.out.println(temp/50 + " nota(s) de R$ 50,00");
    temp = temp%50;
    System.out.println(temp/20 + " nota(s) de R$ 20,00");
    temp = temp%20;
    System.out.println(temp/10 + " nota(s) de R$ 10,00");
    temp = temp%10;
    System.out.println(temp/5 + " nota(s) de R$ 5,00");
    temp = temp%5;
    System.out.println(temp/2 + " nota(s) de R$ 2,00");
    temp = temp%2;
    System.out.println(temp/1 + " nota(s) de R$ 1,00");
    temp = temp%1;
   
     
    }
    }