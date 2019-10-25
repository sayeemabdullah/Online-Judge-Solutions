import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int Alcool = 0;
    int Gasolina = 0;
    int Diesel = 0;
    int MUITOOBRIGADO =0;
    for(int count=1;count>0;count++){
    int code = input.nextInt();
    if(code==1){
    Alcool++;
    }
    else if(code==2){
    Gasolina++;
    }
    else if(code==3){
    Diesel++;
    }
    else if(code>4){
    MUITOOBRIGADO++;
    }
    else if(code==4){
    break;
    }
    }
    if(MUITOOBRIGADO>0){
    System.out.println("MUITO OBRIGADO");
    }
    System.out.println("Alcool: "+Alcool);
    System.out.println("Gasolina: "+Gasolina);
    System.out.println("Diesel: "+Diesel);
    }
}