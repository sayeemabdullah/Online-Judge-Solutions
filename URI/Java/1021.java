import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double y = input.nextDouble();
    double temp = y%1;
    y = y - temp;
    int x = (int)y;
    System.out.println("NOTAS:");
    System.out.println(x/100 + " nota(s) de R$ 100.00");
    x=x%100;
    System.out.println(x/50 + " nota(s) de R$ 50.00");
    x = x %50;
    System.out.println(x/20 + " nota(s) de R$ 20.00");
    x = x %20;
    System.out.println(x/10 + " nota(s) de R$ 10.00");
    x = x %10;
    System.out.println(x/5 + " nota(s) de R$ 5.00");
    x = x%5;
    System.out.println(x/2 + " nota(s) de R$ 2.00");
    x = x%2;
    System.out.println("MOEDAS:");
    System.out.println(x/1 + " moeda(s) de R$ 1.00");
    x = x%1;
    temp = Math.round(temp*100)/100D;
    temp = temp *100;
    int coins = (int) temp;
    System.out.println(coins/50 + " moeda(s) de R$ 0.50");
    coins=coins%50;
    System.out.println(coins/25 + " moeda(s) de R$ 0.25");
    coins=coins%25;
    System.out.println(coins/10 + " moeda(s) de R$ 0.10");
    coins=coins%10;
    System.out.println(coins/5 + " moeda(s) de R$ 0.05");
    coins=coins%5;
    System.out.println(coins/1 + " moeda(s) de R$ 0.01");
    coins=coins%1;  
    }
    }