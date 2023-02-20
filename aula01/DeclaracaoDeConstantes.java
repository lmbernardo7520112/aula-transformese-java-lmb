package aula01;

public class DeclaracaoDeConstantes {
    public static void main(String[] args) {
        final double PI = 3.14;
        final int MILISEGUNDOS_POR_SEGUNDO = 1000;
        final int MILISEGUNDOS_POR_DIA = 24 * 60 * 60 * 1000;

        System.out.println("PI = " + PI);
        System.out.println("Milissegundos por Segundo: " + MILISEGUNDOS_POR_SEGUNDO);
        System.out.println("Milissegundos por Dia :" + MILISEGUNDOS_POR_DIA);
    }
}