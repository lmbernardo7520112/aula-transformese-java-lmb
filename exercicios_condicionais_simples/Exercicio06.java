package exercicios_condicionais_simples;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        int ano = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o Ano de Nascimento: "));

        int idade = 2023 - ano;

        if (idade == 18) {
            JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos.\nHora do seu Alistamento!");
        }
        if (idade > 18) {
            int idadeMaior = idade - 18;
            JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos.\nPassou " + idadeMaior + " anos do seu Alistamento!");
        }
        if (idade < 18) {
            int idadeMenor = 18 - idade;
            JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos.\nNão pode se Alistar!\nSomente daqui " + idadeMenor + " ano(s) ");
        }
    }    
}