import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float[] a = new float[6]; 
      for(int i=0;i<a.length;i++){
        a[i] = input.nextFloat();
        }
      int counter = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]>=0){
        counter++;
        }
        }
      System.out.println(counter+" valores positivos");
      }
    }