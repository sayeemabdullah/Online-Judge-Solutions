import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    for(int count=1;count>0;count++){   
    int M = input.nextInt();
    int N = input.nextInt();
    int temp = M;
    if(N>M){
    M=N;
    N=temp;
    }
    if(M<=0 || N<=0){
    break;
    }
    int sum=0;
    for(int i=N;i<=M;i++){
    System.out.print(N+" ");
    sum=sum+N;
    N++;
    }
    System.out.println("Sum="+sum);
      }    
    }
}
   