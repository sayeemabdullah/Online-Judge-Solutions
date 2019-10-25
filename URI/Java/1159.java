import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    for(int count=1;count>0;count++){   
    int number=input.nextInt();
    if(number==0){
    break;
    }
    int sum = 0;
    if(number%2!=0){
    number++;
    }
    for(int counter=1;counter<=5*2;counter++){
      if(number%2==0){
      sum=sum+number;
      }
      number++;
    }
    System.out.println(sum);
      }
    }
    }
   