import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int T=input.nextInt();
    int N,temp;
    for(int i=1;i<=T;i++){
      int flag=0;
     N=input.nextInt();
     String s="";
     String s1 = String.valueOf(N);
     while(N>0){
        flag=1;
        temp=(N%10);
        s+=temp;
        N=N/10;
     }
     if(s.equals(s1) || flag==0){
        System.out.println("Case "+i+": Yes");
     }
     else{
        System.out.println("Case "+i+": No");
     }
    }
  }
}