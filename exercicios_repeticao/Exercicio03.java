package exercicios_repeticao;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Nome: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-" + nome);
        }
    }    
}
