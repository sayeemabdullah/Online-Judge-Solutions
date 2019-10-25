import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int n=input.nextInt();
            int first=1,last=n;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j==last){
                        System.out.print(2);
                    }
                    else if(j==first){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(3);
                    }
                }
                first++;
                last--;
                System.out.println();
            }
        }
    }
}
