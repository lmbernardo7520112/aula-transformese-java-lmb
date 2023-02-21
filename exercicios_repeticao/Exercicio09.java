package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int maisNovo = Integer.MAX_VALUE;
        String nomeDoMaisNovo = "";

        for (int inteiro = 1; inteiro <= 10; inteiro++) {

            System.out.println("Nome: ");
            String nome = leitor.nextLine();

            System.out.println("Idade: ");
            int idade = leitor.nextInt();

            leitor.nextLine();

            if (idade < maisNovo) {
                maisNovo = idade;
                nomeDoMaisNovo = nome;
            }
        }
            System.out.println("Nome da pessoa mais nova = " + nomeDoMaisNovo + "Idade = " + maisNovo);
    }
}
