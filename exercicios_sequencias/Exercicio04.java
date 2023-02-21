package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor");
        int primeiroValor = leitor.nextInt();

        System.out.println("Digite outro valor");
        int segundoValor = leitor.nextInt();

        int soma = primeiroValor + segundoValor;

        System.out.println("Soma: " + soma);
        System.out.println("--------");
        System.out.println("Soma: " + (primeiroValor + segundoValor));
    }
}
