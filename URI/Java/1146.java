import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
      for(int counter=1;counter<2;counter++){
      for(int count=1;count>0;count++){
      int x = input.nextInt();
      if(x==0){
        break;}
      else{
        for(int output=1;output<=x;output++){
          if(output>=2){
          System.out.print(" ");
          System.out.print(output);
          }
          else{
          System.out.print(output);}
        }
        System.out.println();
      }
      }
      } 
    
    }}