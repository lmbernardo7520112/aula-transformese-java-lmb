package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Nome: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes gostaria de digitar o nome na tela: "));
    
        for (int i = 1; i <= numero; i++) {
            
            System.out.println(i + " = " + name);
        }
    }
}
