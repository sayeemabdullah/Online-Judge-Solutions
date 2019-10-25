import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    int N = input.nextInt();
    int T=0;
    int count=1;
    for(;count>0;count++){
      T=T+A;
    if(T>=N){
    break;}
    T=T-B;
    if(T>=N){
    break;}
    }
    System.out.println(count);
}
}