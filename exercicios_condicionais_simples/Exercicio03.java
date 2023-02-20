package exercicios_condicionais_simples;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Primeira Nota");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a Segunda Nota");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;


        if (media >= 7.00) {
            System.out.println("Aprovado. Bom aproveitamento!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }    
}