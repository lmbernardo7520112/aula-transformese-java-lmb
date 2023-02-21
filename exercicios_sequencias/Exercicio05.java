package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a Primeira Nota");
        float nota1 = leitor.nextFloat();

        System.out.println("Digite a Segunda Nota");
        float nota2 = leitor.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Média das notas:" + media);
    }
}
