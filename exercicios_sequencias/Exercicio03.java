package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Digite o nome do funcionário: ");
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o sálario do funcionário: "));
    
        JOptionPane.showMessageDialog(null,"O funcionário " + name + " tem um sálario de R$ " + salary + " em Junho" );   
    }
}
