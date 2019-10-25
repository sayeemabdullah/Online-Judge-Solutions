import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    //int X = input.nextInt();
    int[] a = new int[10];
    int V = input.nextInt();
    a[0]=V;
    System.out.println("N["+0+"] = "+a[0]);
    for(int count=1;count<a.length;count++){ 
    V = V*2;  
    a[count] = V;
    System.out.println("N["+count+"] = "+a[count]);
    }
      }
 
    }