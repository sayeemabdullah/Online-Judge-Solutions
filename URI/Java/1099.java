import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int totalCase = input.nextInt();
    int[] a = new int[totalCase];
    for(int count=1;count<=a.length;count++){   
    int start = input.nextInt();
    int end = input.nextInt();
    int temp=end;
    if(end<start){
    end=start;
    start=temp;
    }
    int sum = 0;
    for(int counter=start+1;counter<end;counter++){
      if(counter%2!=0){
      sum=sum+counter;
      }
    }
    System.out.println(sum);
      }
      
    }
}
   