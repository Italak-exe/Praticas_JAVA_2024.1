import java.util.Scanner;

public class SomaLogaritmos2 {
    public static double mudancaBase(double valor, double base){
        return Math.log(valor)/Math.log(base);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa vai efetuar o logaritmo de dois valores e retorna a soma.");
        System.out.println("Informe um valor para A: ");
        double A = scanner.nextDouble();

        System.out.println("Informe um valor para B: ");
        double B = scanner.nextDouble();

        System.out.println("Informe um valor para a base X: ");
        double X = scanner.nextDouble();
        scanner.close();

        double logA = (mudancaBase(A, X));
        double logB = (mudancaBase(A, X));

        double sum = logA + logB;

        System.out.println();
        System.out.println("A soma do logaritmo de " + A + " mais o logaritmo de " + B + " é igual a " + sum ) ;
    }
}