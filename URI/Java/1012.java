import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in) ;
    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double pi = 3.14159;
    double TRIANGULO = .5 * A * C ;
    double CIRCULO = pi * (C*C) ;
    double TRAPEZIO = .5 * (A + B) * C ;
    double QUADRADO = B * B ;
    double RETANGULO = A * B ;
    System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
    System.out.printf("CIRCULO: %.3f\n",CIRCULO);
    System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
    System.out.printf("QUADRADO: %.3f\n",QUADRADO);
    System.out.printf("RETANGULO: %.3f\n",RETANGULO); 
    }
}