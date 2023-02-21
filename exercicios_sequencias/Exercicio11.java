package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o coeficiente A: ");
        int coef_A = leitor.nextInt();
        System.out.println("Qual o coeficiente B: ");
        int coef_B = leitor.nextInt();
        System.out.println("Qual o coeficiente C: ");
        int coef_C = leitor.nextInt();

        float discriminante = coef_B * coef_B -4 * coef_A * coef_C;

        System.out.println("Delta: " + discriminante);
    }
}
