import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int second = input.nextInt();
    int minute = second / 60;
    second = second % 60;
    int hour = minute/60;
    minute = minute % 60;
    
    System.out.println(hour+":"+minute+":"+second);
    }
}
