import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int range = input.nextInt();
    for(int i=1;i<=range;i++){
    float x = input.nextFloat();
    float y= input.nextFloat();
    if(y==0){
    System.out.println("divisao impossivel");
    }
    else{
    float sum = x/y;
    System.out.println(sum);
    }
    }
}
}