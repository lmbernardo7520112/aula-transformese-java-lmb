package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 1;

        while (i > 0) {

            System.out.println("Digite o número: ");
            i = leitor.nextInt();
        }
        System.out.println("Valor digitado menor que Zero!");
    }    
}
