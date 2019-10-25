import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();
    for(int count=1;count<=T;count++){
    int N , K;
    N = input.nextInt();
    K = input.nextInt();
    int sum =0;
    int flag=0;
    for(int i=1;i<=N;i++){
    int A = input.nextInt();
    sum=sum+A;
    if(sum>=K){
    flag++;
    }
    }
    if(sum>=K || flag>=1){
    System.out.println("YES");
    }
    else{
    System.out.println("NO");}
    }
}
}
