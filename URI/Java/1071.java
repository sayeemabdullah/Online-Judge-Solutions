import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int end = input.nextInt();
    int start = input.nextInt();
    int sum = 0;
    for(int counter=start+1;counter<end;counter++){
      if(counter%2!=0){
      sum=sum+counter;
      }
    }
    System.out.println(sum);
      }
    }