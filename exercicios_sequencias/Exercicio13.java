package exercicios_sequencias;

import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        
        float salary = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário Atual: R$ "));

        float increase = salary * 15/100;
    
        JOptionPane.showMessageDialog(null,"Sálario com Aumento R$ " + (increase + salary));   
    }
}
