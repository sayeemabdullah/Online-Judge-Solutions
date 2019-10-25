import java.io.IOException;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int i=1,T;
    while(i==1){
    T=input.nextInt();
    int counter0=0;
    int counter1=0;
    if(T==0){
    break;
    }
    else{
      for(int j=0;j<T;j++){
      int value=input.nextInt();
      if(value==0){
      counter0++;
      }
      else{
      counter1++;
      }
      }
    }
    System.out.println("Mary won "+counter0+" times and John won "+counter1+" times");
    }
 }
      }