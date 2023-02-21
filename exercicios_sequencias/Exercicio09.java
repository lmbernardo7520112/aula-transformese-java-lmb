package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor na carteira R$ ");
        float value = leitor.nextFloat();

        float converter = value * 3.45f;

        System.out.println("US$ " + converter);
    }    
}
