package aula02;

import javax.swing.JOptionPane;

public class ClasseTabuada {
    public static void main(String[] args) {
        int multiplicationTable = 0;
        int i = 0;
        
        int numberMultiplicationTabble = Integer.parseInt (JOptionPane.showInputDialog(null,"Tabuada do número: "));

        for ( i = 1; i <= 10; i++) {
            
            multiplicationTable = i * numberMultiplicationTabble;

            //JOptionPane.showMessageDialog(null,i + " X " + numberMultiplicationTabble + " = " + multiplicationTable);
            System.out.println(i + " X " + numberMultiplicationTabble + " = " + multiplicationTable);
        }
    }
}
