package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor");
        int value = leitor.nextInt();

        int antecessor = value - 1;
        int sucessor = value + 1;

        System.out.println("Antecessor " + antecessor + "\n" + " Sucessor " + sucessor);
        System.out.println("-----------------------------");
        System.out.println("Antecessor " + (value - 1) + "\n" + " Sucessor " + (value + 1));
    }
}

