import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    double z = x * y;
    double ans = z/12 ;
    System.out.printf("%.3f\n",ans);
    //System.out.println(x*2 + " minutos");
    
    }
}