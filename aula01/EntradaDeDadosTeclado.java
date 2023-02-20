package aula01;

import java.util.Scanner;

public class EntradaDeDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Idade digitada: " + idade);
    }
}

