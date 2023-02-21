package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int deMaior = 0;
        int inteiro = 1;
        do {
            
        System.out.println("Digite a Idade da " + inteiro + "ª Pessoa.");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            deMaior ++;
        }

        inteiro ++;

        } while (inteiro <= 20);
        
        System.out.println("Quantidade de maiores de idade = " + deMaior);
    }
}
