import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double sum = 0;
    double denom=1;
    for(double count=1;count<=39;count+=2){
    double number = count/denom;
    sum=sum+number;
    denom=denom*2;
    }
    System.out.printf("%.2f\n",sum);
}
}