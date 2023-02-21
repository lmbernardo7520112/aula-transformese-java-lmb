package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Digite seu Nome: ");

        JOptionPane.showMessageDialog(null,"Olá " + name + " é um prazer te conhecer!" );  
    }
}
