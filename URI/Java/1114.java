import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);   
    for(int i=1;i>0;i++){
    int pass = input.nextInt();
    if(pass==2002){
    System.out.println("Acesso Permitido");
    break;
    }
    else{
    System.out.println("Senha Invalida");}
    }  
}
}