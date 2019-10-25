import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int totalCase = input.nextInt();
    int[] a = new int[totalCase];
    for(int count=1;count<=a.length;count++){   
    int start = input.nextInt();
    int end = input.nextInt();
    int sum = 0;
    for(int counter=1;counter<=end*2;counter++){
      if(start%2!=0){
      sum=sum+start;
      }
      start++;
    }
    System.out.println(sum);
      }
    }
    }
   