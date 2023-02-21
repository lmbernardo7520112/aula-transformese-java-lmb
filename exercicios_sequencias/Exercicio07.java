package exercicios_sequencias;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor");
        float value = leitor.nextFloat();

        float bent = value * 2;
        float thirdOf = value / 3;

        System.out.println("O dobro de " + value + " é " + bent + "\n"
        + "A terça parte de " + value + " é " + thirdOf);
    }
}
