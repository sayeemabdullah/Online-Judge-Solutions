import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int first = 0;
    int second = 1;
    System.out.print(first);
    for(int counter=1;counter<=N-1;counter++){
    System.out.print(" "+second);
    int sum = first + second;
    first = second;
    second = sum;
    }
    System.out.println();
    }
 
}