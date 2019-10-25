import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int end = input.nextInt();
    for(int counter=end;counter<=end+12;counter++){
      if(counter%2!=0){
      System.out.println(counter);
      }
    }
      }
    }