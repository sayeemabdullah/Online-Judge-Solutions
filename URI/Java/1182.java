import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner (System.in);
    
   int line=input.nextInt();
    float sum=0;
   char todo=input.next().charAt(0);
   
    float a[][] = new float[12][12];
    for(int i=0;i<12;i++){
      for(int j=0;j<12;j++){
      a[i][j]=input.nextFloat();
      if(j==line){
      sum=sum+a[i][j];
      }
      }
    }
    if(todo=='S'){
    System.out.println(sum);
    }
    else if(todo=='M'){
    sum=sum/12;
    System.out.printf("%.1f\n",sum);
    }
    }
  }