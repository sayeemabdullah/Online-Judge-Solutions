import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int T=input.nextInt(),A,B,C;
    for(int i=1; i<=T; i++){
      A=input.nextInt();
      B=input.nextInt();
      C=input.nextInt();
      if((A<B && A>C) || (A>B && A<C) ){
      System.out.println("Case "+i+": "+A);
      }
      else if((B<A && B>C) || (B>A && B<C) ){
      System.out.println("Case "+i+": "+B);
      }
      else{
      System.out.println("Case "+i+": "+C);
      }
    }
  }
}