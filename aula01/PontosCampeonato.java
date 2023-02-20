package aula01;

import java.util.Scanner;

public class PontosCampeonato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pontos do LÍDER do Campeonato: ");
        int pontosLider = scan.nextInt();
        
        System.out.println("Pontos do LANTERNA do Campeonato: ");
        int pontosUltimo = scan.nextInt();

        int calculoVitorias = (pontosLider - pontosUltimo) / 3;

        System.out.println("Vitórias Necessárias: " + calculoVitorias);
    }
}
