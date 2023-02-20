package aula02;

import javax.swing.JOptionPane;

public class MaleOrFemale {
    public static void main(String[] args) {
        Object[] opcoes = {"Male", "Female"};
        String resposta = (String) JOptionPane.showInputDialog(null, "Selecione Sexo:\n ", 
        "Pesquisa",JOptionPane.PLAIN_MESSAGE,null,opcoes,"Male");

        if (resposta == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou cancelar");
        }

        if (resposta == "Male") {
            JOptionPane.showMessageDialog(null, "Você Selecionou Male");
        }

        if (resposta == "Female") {
            JOptionPane.showMessageDialog(null, "Você Selecionou Female");
        }

        System.exit(0);
    }
}
