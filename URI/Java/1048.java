import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input=new Scanner(System.in);
    
    float x = input.nextFloat();
    if(x<=400){
    System.out.printf("Novo salario: %.2f\n",x+(x*0.15));
    System.out.printf("Reajuste ganho: %.2f\n",x*0.15);
    System.out.println("Em percentual: 15 %"); 
    }
    else if(x<=800){
    System.out.printf("Novo salario: %.2f\n",x+(x*0.12));
    System.out.printf("Reajuste ganho: %.2f\n",x*0.12);
    System.out.println("Em percentual: 12 %"); 
    }
    else if(x<=1200){
    System.out.printf("Novo salario: %.2f\n",x+(x*0.10));
    System.out.printf("Reajuste ganho: %.2f\n",x*0.10);
    System.out.println("Em percentual: 10 %"); 
    }
    else if(x<=2000){
    System.out.printf("Novo salario: %.2f\n",x+(x*0.07));
    System.out.printf("Reajuste ganho: %.2f\n",x*0.07);
    System.out.println("Em percentual: 7 %"); 
    }
    else if (x>2000){
    System.out.printf("Novo salario: %.2f\n",x+(x*0.04));
    System.out.printf("Reajuste ganho: %.2f\n",x*0.04);
    System.out.println("Em percentual: 4 %"); 
    }
    }
    }