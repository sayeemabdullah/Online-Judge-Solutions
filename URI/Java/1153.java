import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int product = N;
    for(int count=1;count<=N-1;count++){
    product = product * count;
    }
    System.out.println(product);
}
}