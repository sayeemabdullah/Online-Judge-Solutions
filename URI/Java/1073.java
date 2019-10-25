import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      for(int counter=1;counter<=x;counter++){
        if(counter%2==0){
         System.out.println(counter+"^"+2+" = "+counter*counter); 
        }
      }
    }
}