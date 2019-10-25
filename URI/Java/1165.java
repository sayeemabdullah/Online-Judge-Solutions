import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int X = input.nextInt();
    int[] a = new int[X];
    for(int count=1;count<=a.length;count++){   
    int number=input.nextInt();
    int divisor=0;
    for(int counter=1;counter<=number;counter++){
      if(number%counter==0){
      divisor++;
      }
    }
    if(divisor==2){
    System.out.println(number+" eh primo");
    }
    else{
    System.out.println(number+" nao eh primo");
    }
    }
      }
    }