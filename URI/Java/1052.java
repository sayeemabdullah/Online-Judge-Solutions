import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    if(number==1){
    System.out.println("January");
    }
    else if(number==2){
    System.out.println("February");
    } 
    else if(number==3){
    System.out.println("March");
    }
    else if(number==4){
    System.out.println("April");
    } 
    else if(number==5){
    System.out.println("May");
    } 
    else if(number==6){
    System.out.println("June");
    } 
    else if(number==7){
    System.out.println("July");
    } 
    else if(number==8){
    System.out.println("August");
    } 
    else if(number==9){
    System.out.println("September");
    } 
    else if(number==10){
    System.out.println("October");
    } 
    else if(number==11){
    System.out.println("November");
    } 
    else if(number==12){
    System.out.println("December");
    } 
    }
}