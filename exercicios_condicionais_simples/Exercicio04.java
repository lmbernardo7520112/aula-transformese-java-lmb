package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int value = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o número: "));

        if (value % 2 == 0) {
            JOptionPane.showMessageDialog(null,value + " = PAR" );
        } else {
            JOptionPane.showMessageDialog(null,value + " = IMPAR");
        }
    }    
}
