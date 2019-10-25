import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner input= new Scanner (System.in);
//input.nextLine();
    int x,counter=0,i=3;
    String s;
    double adder=0;
    while(input.hasNextLine()){
        s=input.nextLine();
        x=input.nextInt();
         counter++;
        adder+=x;
        input.nextLine();
        i--;
    }
    adder=adder/counter;
    System.out.printf("%.1f\n",adder);
}
}