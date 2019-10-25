import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    for(int count=1;count>0;count++){   
    int M = input.nextInt();
    int N = input.nextInt();
    if(M>N){
    System.out.println("Decrescente");
    }
    else if(M<N){
    System.out.println("Crescente");
    }
    else if(M==N){
    break;
    }
    
    }
}
}