import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    //int X = input.nextInt();
    int[] a = new int[10];
    for(int count=0;count<a.length;count++){   
    a[count] = input.nextInt();
    if(a[count]<=0){
    a[count]=1;
    }
      }
    for(int i=0;i<a.length;i++){
    System.out.println("X["+i+"] = "+a[i]);
    }
    }
}