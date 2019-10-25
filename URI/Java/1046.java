import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input=new Scanner(System.in);
    
    int start = input.nextInt();
    int end = input.nextInt();
    
    if(start==end){
      System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    else if(start>end){
     System.out.println("O JOGO DUROU "+((24-start)+end)+" HORA(S)");
    }
    else if(start<end){
     System.out.println("O JOGO DUROU "+(end-start)+" HORA(S)");
    }
    }
    }