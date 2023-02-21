package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
    
    double product = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Produto: R$ "));

    double discount = product * 5/100;

    JOptionPane.showMessageDialog(null,"PREÇO PROMOCIONAL R$ " + (product - discount));   
    }
}
