import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float sum = 0;
    float number;
    for(float count=1;count<=100;count++){
    number = 1/count;
    sum=sum+number;
    }
    System.out.printf("%.2f\n",sum);
}
}