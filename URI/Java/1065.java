import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float[] a = new float[5]; 
      for(int i=0;i<a.length;i++){
        a[i] = input.nextFloat();
        }
      int counter = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
        counter++;
        }
        }
      System.out.println(counter+" valores pares");
      }
    }