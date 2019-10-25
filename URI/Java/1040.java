import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    float N1 = input.nextFloat();
    float N2 = input.nextFloat();
    float N3 = input.nextFloat();
    float N4 = input.nextFloat();
    float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;
    System.out.printf("Media: %.1f\n", media);
    //System.out.println("Media: "+media);
    {
      if(media>=7.0){
    System.out.println("Aluno aprovado.");
    }
    else if(media <5.0){
    System.out.println("Aluno reprovado.");
    }
    else if (media>=5.0 && media <=6.9) {
    System.out.println("Aluno em exame.");
    }
    }
    //double mark = 0 ;
    if (media>=5.0 && media <=6.9) {
    double mark = input.nextDouble(); 
    System.out.println("Nota do exame: "+ mark);
    double avg = (media+mark)/2;
    if(avg>=5.0){
    System.out.println("Aluno aprovado.");
    }
    else {
    System.out.println("Aluno reprovado.");
    }
    System.out.printf("Media final: %.1f\n", avg);
    }
      
    }
}