import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input=new Scanner(System.in);
    float A = input.nextFloat();
    float B = input.nextFloat();
    float C = input.nextFloat();
    float temp;
    {
    float [] a={A,B,C};
    for(int sort=0; sort<a.length-1; sort++) 
    {
      float max=a[sort];
      int location=sort;
      float backup=max;
      for(int check=sort+1; check<a.length; check++) 
      {
        if(a[check]>max)
        {
          max=a[check];
          location=check;
        }
      }
      a[sort]=max;
      a[location]=backup;
    }
    A=a[0];
    B=a[1];
    C=a[2];
  }
     if (A >= (B + C)) {
   System.out.println("NAO FORMA TRIANGULO");
   
  }else if (A*A > ((B*B)+(C*C))) {
   System.out.println("TRIANGULO OBTUSANGULO");
  }
  if (A*A == ((B*B)+(C*C))) {
   System.out.println("TRIANGULO RETANGULO");
  }

   if (A*A < ((B*B)+(C*C))) {
   System.out.println("TRIANGULO ACUTANGULO");
  }
  if ((A == B) &&(A == C)) {
   System.out.println("TRIANGULO EQUILATERO");
  }
  if (((A == B) &&(A != C)) || ((A == C) &&(A != B)) || ((B == C) &&(B != A)) ) {
   System.out.println("TRIANGULO ISOSCELES");
  }
    }
    }