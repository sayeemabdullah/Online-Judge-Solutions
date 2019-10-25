import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    for(int counter=1;counter<=N;counter++){
      if(N%counter==0){
      System.out.println(counter);
      }
    }
}
}