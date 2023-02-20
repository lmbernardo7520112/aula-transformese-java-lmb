package aula02;

import javax.swing.JOptionPane;


public class ProductAndValue {
    public static void main(String[] args) {
        float totalValue = 0.0f;
         

        String name = JOptionPane.showInputDialog(null,"Nome do Produto");
        float productValue = Float.parseFloat (JOptionPane.showInputDialog(null,"Valor do produto: "));

        if (0 > productValue) {
            JOptionPane.showMessageDialog(null,"Valor Menor que Zero!!");
            System.exit(0);
        }
        if ((productValue >=50) && (productValue < 200)) {
            totalValue = (productValue * 5) / 100;
        } 
        if ((productValue >=200) && (productValue < 500)) {
            totalValue = (productValue * 6) / 100;
        }
        if ((productValue >=500) && (productValue < 1000)) {
            totalValue = (productValue * 7) / 100;
        }

        if (productValue >= 1000) {
            totalValue = (productValue * 8) / 100;
        }
    
        JOptionPane.showMessageDialog(null,"Nome do Produto: " + name + "\n" + "Valor do Produto: " + productValue + "\n"  + "Valor com Desconto R$ " + (productValue - totalValue));
    }
}
