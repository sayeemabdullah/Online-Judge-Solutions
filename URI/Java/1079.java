import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int totalCase = input.nextInt();
    for(int count=1;count<=totalCase;count++){   
    double x = input.nextDouble();
    double y = input.nextDouble();
    double z = input.nextDouble();
    double avg = ((x*2)+(y*3)+(z*5))/10;
    System.out.printf("%.1f\n",avg);
      }
      
    }
}
   