package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        float distancia = Float.parseFloat (JOptionPane.showInputDialog(null,"Distâcia que deseja percorrer em Km: "));

        if (distancia <= 200) {
            float total = distancia * 0.50f;
            JOptionPane.showMessageDialog(null,"Preço por Km = R$ 0.50" + "\n Total á Pagar: R$ " + total);
        } else {
            float total = distancia * 0.45f;
            JOptionPane.showMessageDialog(null,"Preço por Km = R$ 0.45" + "\n Total á Pagar: R$ " + total);
        }
    }    
}