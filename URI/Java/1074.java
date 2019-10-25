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
    for(int i=0; i<a.length;i++){
      if(a[i]%2==0){
        if(a[i]==0){
        System.out.println("NULL");
        }
        else if(a[i]<0){
        System.out.println("EVEN NEGATIVE");
        }
        else if (a[i]>0){
        System.out.println("EVEN POSITIVE");
        }
      }
      if(a[i]%2!=0){
        if(a[i]<0){
        System.out.println("ODD NEGATIVE");
        }
        else{
        System.out.println("ODD POSITIVE");
        }
      }
    }
    }
}