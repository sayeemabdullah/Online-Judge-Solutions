import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int [] a = new int[x];
    for(int i=0; i<a.length;i++){
    a[i] = input.nextInt();
    }
    int in=0;
    for(int i=0; i<a.length;i++){
      if(a[i]>=10 && a[i]<=20){
      in++;
      }
    }
      int out=0;
      for(int j=0; j<a.length;j++){
      if(a[j]<10 || a[j] >20){
      out++;
      }
    }
    System.out.println(in + " in");
    System.out.println(out + " out");
    }
}