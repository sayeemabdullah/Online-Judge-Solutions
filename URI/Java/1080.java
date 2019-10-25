import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
      int[] a = new int[100];
      a[0]= input.nextInt();
      int max=a[0];
      int index=1;
      for(int i=1;i<a.length;i++){
      a[i]=input.nextInt();
      if(a[i]>max){
      max=a[i];
      index=i+1;
      }
      }
      System.out.println(max);
      System.out.println(index);
        }
      }