package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int NumerosEntreZeroECem = 0;
        int NumerosEntreCemEDuzentos = 0;
        int NumerosMaiorQueDuzentos = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite o " + i + "ª número: ");
            int num = leitor.nextInt();

            if ((num > 0) && (num <= 100)) {
                NumerosEntreZeroECem ++;
            }
            if ((num > 100) && (num <= 200)) {
                NumerosEntreCemEDuzentos ++;
            }
            if (num > 200) {
                NumerosMaiorQueDuzentos ++;
            }
        }
        System.out.println("Quantidade de números entre 0 e 100 = " + NumerosEntreZeroECem + "\n"
                           + "Quantidade de números entre 101 e 200 = " + NumerosEntreCemEDuzentos + "\n"
                            + "Quantidade de números maiores que 200 = " + NumerosMaiorQueDuzentos);
    }    
}
