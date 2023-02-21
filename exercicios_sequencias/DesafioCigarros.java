package exercicios_sequencias;

import javax.swing.JOptionPane;

public class DesafioCigarros {
    public static void main(String[] args) {
        final int DIAS_ANO = 365;

        int numeroCigarros = Integer.parseInt (JOptionPane.showInputDialog(null, "Fuma quantos cigarros por dia? "));
        int anosFumando = Integer.parseInt (JOptionPane.showInputDialog(null, "É fumante à quantos anos? "));

        float reducaoNosMinutos = (anosFumando * DIAS_ANO) * numeroCigarros * 10;
        float reducaoNosDias = reducaoNosMinutos / (24*60);

        JOptionPane.showMessageDialog(null,"Dias perdidos: " + reducaoNosDias );  
    }
}
