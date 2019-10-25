import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    //int X = input.nextInt();
    float[] a = new float[100];
    for(int count=0;count<a.length;count++){ 
    a[count]=input.nextFloat();
    }
    for(int i=0;i<a.length;i++){
      if(a[i]<=10){
      System.out.println("A["+i+"] = "+a[i]);
      }  
    }
      }
    }