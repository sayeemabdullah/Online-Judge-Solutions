import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    
    int a=input.nextInt();
    int b=input.nextInt();
    int n;
    for(n=1; ;n++)
    {
      a*=3;
      b*=2;
      if(a>b)
      {
        break;
      }
    }
    System.out.println(n); 
  input.close();
  }  
}