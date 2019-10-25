import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] evenArray = new int[5];
        int[] oddArray = new int[5];
        int evenCounter=0,oddCounter=0;
        for(int i=0;i<15;i++){
            if(evenCounter==5){
                for(int k=0;k<evenCounter;k++){
                    System.out.println("par["+k+"] = "+evenArray[k]);
                }
                evenCounter=0;
            }
            else if(oddCounter==5){
                for(int j=0;j<oddCounter;j++){
                    System.out.println("impar["+j+"] = "+oddArray[j]);
                }
                oddCounter=0;
            }
            int n=input.nextInt();
            if(n%2==0){
                evenArray[evenCounter]=n;
                evenCounter++;
            }
            else{
                oddArray[oddCounter]=n;
                oddCounter++;
            }

        }
        for(int j=0;j<oddCounter;j++){
            System.out.println("impar["+j+"] = "+oddArray[j]);
        }
        for(int k=0;k<evenCounter;k++){
            System.out.println("par["+k+"] = "+evenArray[k]);
        }
    }
}
