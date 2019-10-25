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
    for(int count=start+1;count<end;count++){
      if(count%5==2  || count%5==3 ){
      System.out.println(count);
      }
    }
    }
}