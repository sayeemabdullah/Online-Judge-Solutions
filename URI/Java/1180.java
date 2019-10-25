import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int X = input.nextInt();
    int[] a = new int[X];
    a[0]=input.nextInt();
    int min = a[0];
    int location = 0;
    for(int i=1;i<a.length;i++){ 
    a[i]=input.nextInt();
    if(a[i]<min){
      min=a[i];
      location = i ;
    }
    }
    System.out.println("Menor valor: "+min);
    System.out.println("Posicao: "+location);
      }  
    }
   