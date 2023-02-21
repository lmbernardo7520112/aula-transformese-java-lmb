package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        final float PRECO_DIA = 90f;
        final float PRECO_QUILOMETRO = 0.20f;

        float QuilometrosRodados = Float.parseFloat(JOptionPane.showInputDialog(null, "Quilometros percorridos: "));
        float dias = Float.parseFloat(JOptionPane.showInputDialog(null, "Dias Utilizados: "));

        float calculoPorDia = PRECO_DIA * dias;
        float calculoPorQuilometros = PRECO_QUILOMETRO * QuilometrosRodados;

        JOptionPane.showMessageDialog(null,"Total á Pagar R$ " + (calculoPorDia + calculoPorQuilometros));
    }
}
