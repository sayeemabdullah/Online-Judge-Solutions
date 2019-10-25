import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    
    int num=input.nextInt();
    if(num%2==0)
    {
      System.out.println("Bob");
    }
    else
    {
      System.out.println("Alice");
    }
  }
  
}