import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();
    
    if(A>B && A>C){
    System.out.println(A+" eh o maior" );}
    else if(B>A && B>C){
    System.out.println(B+" eh o maior" );}
    else {
    System.out.println(C+" eh o maior" );}
        
    }
}