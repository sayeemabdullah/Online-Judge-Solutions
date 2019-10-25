import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float[] a = new float[6]; 
      for(int i=0;i<a.length;i++){
        a[i] = input.nextFloat();
        }
      float sum =0;
      int counter = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]>=0){
        counter++;
        sum = sum + a[i];
        }
        }
      float avg = sum/counter;
      System.out.println(counter+" valores positivos");
      System.out.printf("%.1f\n",avg);
      }
    }