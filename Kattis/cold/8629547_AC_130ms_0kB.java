import java.util.Scanner;
public class Main
  
{public static void main(String[] args)
{Scanner input = new Scanner (System.in);
{
int n= input.nextInt();
int amount=0;
for(int counter=1;counter<=n;counter++){
int t= input.nextInt();
if(t<0){
amount++;}}
System.out.println(amount);}
input.close();
}
}
