import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int day = input.nextInt();
    int year = day / 365;
    day = day % 365;
    int month = day / 30;
    day = day % 30 ;
    
    System.out.println(year +" ano(s)");
    System.out.println(month +" mes(es)");
    System.out.println(day +" dia(s)");
 
    }
 
}