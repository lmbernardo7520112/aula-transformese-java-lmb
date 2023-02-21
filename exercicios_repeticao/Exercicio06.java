package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaDasIdades = 0;
        int inteiro = 1;
        do {
            
        System.out.println("Digite a Idade da " + inteiro + "ª Pessoa.");
        int idade = scanner.nextInt();

        somaDasIdades += idade;
        inteiro++;

        } while (inteiro <= 20);

        System.out.println("Soma das Idades = " + somaDasIdades + " anos");

    }    
}
