package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Determine o comprimento da Parede: ");
        float length = leitor.nextFloat();
        System.out.println("Determine a altura da Parede: ");
        float height = leitor.nextFloat();

        float area = height * length ;

        System.out.println("Área: " + area + "m²");
        System.out.println("Você necessita de " + (area/2) + "ml de tinta.");
    }
}
