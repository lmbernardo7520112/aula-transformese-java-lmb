package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        double velocidadeDoCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade do Veiculo: "));

        if (velocidadeDoCarro > 80.0) {
            JOptionPane.showMessageDialog(null, "Você foi Multado!!!");

            double velocidadeEmExcesso = velocidadeDoCarro - 80;
            double valorDaMulta = 5.0 * velocidadeEmExcesso;

            JOptionPane.showMessageDialog(null, "Você passou a acima do limite " + velocidadeEmExcesso + "Km/h \n E deverar pagar R$ " + valorDaMulta);
        }
        else {
            JOptionPane.showMessageDialog(null, "Velocidade permitida!");
        }
    }
}