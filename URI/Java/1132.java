import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int start = input.nextInt();
    int end  = input.nextInt();
    int temp = end;
    if(start>end){
    end=start;
    start=temp;
    }
    int sum = 0;
    for(int count=start;count<=end;count++){
      if(count%13!=0){
      sum=sum+count;
      }
    }
    System.out.println(sum);
    }
}