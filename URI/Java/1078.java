import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      for(int counter=1;counter<=10;counter++){
         System.out.println(counter+" x "+x+" = "+counter*x); 
        }
      }
    }