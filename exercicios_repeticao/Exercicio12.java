package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int i = 1;
        do {
            
        System.out.println("Digite o " + i + "ª Número.");
        int num = leitor.nextInt();

        if (num % 2 == 0) {
            par ++;
        }

        i ++;

        } while (i <= 20);
        
        System.out.println("Quantidade de números pares = " + par);
    }    
}
