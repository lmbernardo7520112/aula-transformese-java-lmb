package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int NumerosEntreZeroECem = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite o " + i + "ª número: ");
            int num = leitor.nextInt();

            if ((num > 0) && (num <= 100)) {
                NumerosEntreZeroECem ++;
            }
        }
        System.out.println("Quantidade de números entre 0 e 100 = " + NumerosEntreZeroECem);    
    }   
}
