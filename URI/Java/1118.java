import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    for(int counter=1;counter>0;counter++){
    float A = input.nextFloat();
    while(A<0 ||  A>10){
     System.out.println("nota invalida");
     A = input.nextFloat();
    }
    float B = input.nextFloat();
    while(B<0 ||  B>10){
     System.out.println("nota invalida");
     B = input.nextFloat();
    }
    float media = (A+B)/2;
    System.out.printf("media = %.2f\n",media);
     
    System.out.println("novo calculo (1-sim 2-nao)");
    int select = input.nextInt();
    while(select<1 || select>2){
    System.out.println("novo calculo (1-sim 2-nao)");
    select = input.nextInt();
    }
    if(select==2){
    break;}
}
        }
}