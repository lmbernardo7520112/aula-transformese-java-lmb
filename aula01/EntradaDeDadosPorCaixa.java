package aula01;

import javax.swing.JOptionPane;

public class EntradaDeDadosPorCaixa {
    public static void main(String[] args) {
        int idade = 0;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        System.out.println("A idade digitada foi: " + idade);
    }
}
