import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int X = input.nextInt();
    int[] a = new int[X];
    for(int count=1;count<=a.length;count++){   
    int number=input.nextInt();
    int sum=0;
    for(int counter=1;counter<number;counter++){
      if(number%counter==0){
      sum=sum+counter;
      }
    }
    if(number==sum){
    System.out.println(number+" eh perfeito");
    }
    else{
    System.out.println(number+" nao eh perfeito");
    }
    }
      }
    }