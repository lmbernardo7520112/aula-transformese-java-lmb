package exercicios_sequencias;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma distância: ");
        float medida  = leitor.nextFloat();

        System.out.println("A distância de " + medida + "m corresponde a:");

        float quilometro = medida / 1000;
        float hectometro = medida / 100;
        float decametro = medida / 10;
        float decimetro = medida * 1;
        float centimetro = medida * 100;
        float milimetro = medida * 1000;

        System.out.println(quilometro + " Quilômetros(Km)");
        System.out.println(hectometro + " Hectômetro(Hm)");
        System.out.println(decametro + " Decâmetro(Dm)");
        System.out.println(decimetro + " Decímetro(Dc)");
        System.out.println(centimetro + " Centímetro(Cm)");
        System.out.println(milimetro + " Milímetro(Mm)");
    }
}
