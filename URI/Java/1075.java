import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    //int sum = 2;
    //System.out.println(sum);
    for (int c=1;c<10000;c++){
      if(c%x==2){
      System.out.println(c);
      };
    }
    }
}
