import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan=new Scanner(System.in);
    int[] a=new int[3];
    int[] b=new int[3];
    for(int input=0; input<a.length; input++)
    {
      a[input]=scan.nextInt();
      b[input]=a[input];
    }
    for(int sort=0; sort<a.length-1; sort++) 
    {
      int min=a[sort];
      int location=sort;
      int backup=min;
      for(int check=sort+1; check<a.length; check++) 
      {
        if(a[check]<min)
        {
          min=a[check];
          location=check;
        }
      }
      a[sort]=min;
      a[location]=backup;
    }
    for(int output=0; output<a.length; output++)
    {
      System.out.println(a[output]);
    }
    System.out.println();
    for(int output=0; output<a.length; output++)
    {
      System.out.println(b[output]);
    }
    }
}