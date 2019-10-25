import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    //int X = input.nextInt();
    int[] a = new int[20];
    for(int count=0;count<a.length;count++){ 
    a[count]=input.nextInt();
    }
    int C=0;
    for(int i=a.length-1;i>=0;i--){
    System.out.println("N["+C+"] = "+a[i]);
    C++;
      }  
    }
      }