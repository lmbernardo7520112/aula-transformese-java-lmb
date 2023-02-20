package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Nome do cliente: ");
        String sexo = JOptionPane.showInputDialog(null,"Sexo do cliente: ");
        float valorCompra = Float.parseFloat (JOptionPane.showInputDialog(null,"Valor da Compra: R$ "));

        if (sexo.equals("Masculino") || (sexo.equals("M"))) {
           Float total = valorCompra - (valorCompra * 5/100);
           JOptionPane.showMessageDialog(null,nome +  " Total da sua compra com 5 % de Desconto: R$ " + total);
        }
        if (sexo.equals("Feminino") || (sexo.equals("F"))) {
            Float total = valorCompra - (valorCompra * 13/100);
            JOptionPane.showMessageDialog(null,nome + " Total da sua compra com 13 % de Desconto: R$ " + total);
        }
    }    
}
