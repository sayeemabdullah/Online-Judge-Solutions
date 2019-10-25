import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float[] a = new float[5]; 
      for(int i=0;i<a.length;i++){
        a[i] = input.nextFloat();
        }
      int counterEven = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
        counterEven++;
        }
        }
      int counterOdd = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]%2!=0){
        counterOdd++;
        }
        }
      int counterPositive = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]>0){
        counterPositive++;
        }
        }
       int counterNegative = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]<0){
        counterNegative++;
        }
        }
      System.out.println(counterEven+" valor(es) par(es)");
      System.out.println(counterOdd+" valor(es) impar(es)");
      System.out.println(counterPositive+" valor(es) positivo(s)");
      System.out.println(counterNegative+" valor(es) negativo(s)");
      }
    }