package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        final int ANO_ATUAL = 2023;

        int anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de Nascimento: "));

        int calcularAno = ANO_ATUAL - anoDeNascimento;

        if ((calcularAno < 70) && (calcularAno < 16)) {
            JOptionPane.showMessageDialog(null,"Você tem " + calcularAno + " anos. NÃO É PERMITIDO VOTAR!!" );
        } else {
            JOptionPane.showMessageDialog(null,"Você tem " + calcularAno + " anos. PERMITIDO VOTAR!!");
        }
    }
}
