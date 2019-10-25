import java.util.Scanner;
//import java.io.IOException;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        for(int i=0;i<test;i++){
        long A=input.nextLong();
        long B=input.nextLong();
        long sum=A-B;
        if(sum<0){
            System.out.println("nao encaixa");
        }
        else if(sum==0){
            System.out.println("encaixa");
        }
        else {
            long tempA,tempB;
            while(B!=0) {
                tempA = A % 10;
                tempB = B % 10;
                if (tempA != tempB) {
                    System.out.println("nao encaixa");
                    break;
                }
                A /= 10;
                B /= 10;
            }
            if(B==0){
            System.out.println("encaixa");
            }
            }
        }

    }
}
