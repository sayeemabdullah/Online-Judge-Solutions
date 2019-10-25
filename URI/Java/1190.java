import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner (System.in);
    
   float sum=0;
   char O=input.next().charAt(0);
   
    float a[][] = new float[12][12];
    for(int i=0;i<12;i++){
      for(int j=0;j<12;j++){
      a[i][j]=input.nextFloat();
      }
      }
    int temp=11;
     for(int i=1;i<=5;i++){
      for(int j=temp;j<12;j++){
      sum+=a[i][j];
      }
      temp--;
     }
     
      for(int i=6;i<11;i++){
      for(int j=i+1;j<=11;j++){
      sum+=a[i][j];
      }
      }
    if(O=='S'){
    System.out.println(sum);
    }
    else if(O=='M'){
    sum=sum/30;
    System.out.printf("%.1f\n",sum);
    }
    }
  }