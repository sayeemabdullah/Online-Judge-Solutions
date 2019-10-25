import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    float denom =0;
    for(int count=1;count>0;count++){
    int N = input.nextInt();
    if(N<0){
    break;
    }
    else{
    sum=sum+N;
    denom++;
    }
    }
    float avg = sum/denom;
    System.out.printf("%.2f\n",avg);
}
}