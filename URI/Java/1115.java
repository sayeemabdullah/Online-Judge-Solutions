import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    for(int i=1;i>0;i++){
    float x = input.nextFloat();
    float y= input.nextFloat();
    if(x==0 || y==0){
    break;
    }
    else if(x>0 && y>0){
    System.out.println("primeiro");
    }
    else if(x<0 && y>=0){
    System.out.println("segundo");
    }
    else if(x<0 && y<0){
    System.out.println("terceiro");
    }
    else if(x>0 && y<0){
    System.out.println("quarto");
    }
    }
    }
}