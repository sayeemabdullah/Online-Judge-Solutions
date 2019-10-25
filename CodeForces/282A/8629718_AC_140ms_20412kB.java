import java.util.Scanner;
public class Main
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
 String string=input.nextLine();
 int n=Integer.parseInt(string);
  String x;
   int v=0;
   for(int i=1;i<=n;i++)
   {
    x=input.nextLine();
    if(x.equals("X++") || x.equals("++X"))
    {
     v++;
     }
     else{v--;
     }
     }
    System.out.println(v);
    input.close();
  } 
}