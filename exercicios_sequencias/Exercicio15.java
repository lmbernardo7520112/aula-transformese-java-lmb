package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        final float VALOR_HORA_TRABALHO = 25.0f;

        int diasTrabalhados = Integer.parseInt (JOptionPane.showInputDialog(null, "Qiuantos dias trabalhados no mês? "));

        float calcularSalario = (8 * VALOR_HORA_TRABALHO) * diasTrabalhados;

        JOptionPane.showMessageDialog(null,"Salário calculado - R$ " + calcularSalario);
    }
}