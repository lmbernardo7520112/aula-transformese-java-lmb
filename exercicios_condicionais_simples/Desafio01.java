package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Desafio01 {
    public static void main(String[] args) {
        float reta01 = Float.parseFloat (JOptionPane.showInputDialog(null,"Comprimento da 1ª Reta: "));
        float reta02 = Float.parseFloat (JOptionPane.showInputDialog(null,"Comprimento da 2ª Reta: "));
        float reta03 = Float.parseFloat (JOptionPane.showInputDialog(null,"Comprimento da 3ª Reta: "));


        if ((reta01 + reta02 > reta03) && (reta01 + reta03 > reta02) && (reta02 + reta03 > reta01)) {
            JOptionPane.showMessageDialog(null,"SIM! \n É possível formar um Triângulo");
        } 
        else {
            JOptionPane.showMessageDialog(null,"NÃO! \n Impossível formar um Triângulo");
        }
    }
}
