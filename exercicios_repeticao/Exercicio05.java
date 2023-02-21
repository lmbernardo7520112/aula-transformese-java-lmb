package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaDosValores = 0;
        int inteiro = 1;
        do {
            
        System.out.println("Digite o " + inteiro + "ª número");
        int value = scanner.nextInt();

        somaDosValores += value;
        inteiro ++;

        } while (inteiro <= 15);

        System.out.println("Soma dos valores = " + somaDosValores);
    }
}
