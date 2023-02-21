package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int somaDasIdades = 0;
        int inteiro = 1;
        do {
            
        System.out.println("Digite a Idade da " + inteiro + "ª Pessoa.");
        int idade = leitor.nextInt();

        somaDasIdades += idade;
        inteiro ++;

        } while (inteiro <= 20);
        
        float mediaDasIdades = somaDasIdades / 20;

        System.out.println("Média das Idades = " + mediaDasIdades);
    }
}
