package aula02;

import javax.swing.JOptionPane;

public class PasswordAndLogin {
    public static void main(String[] args) {
        final String LOGIN = "transformese";
        final String PASSWORD = "transformese";

        for (int i = 0; i < 3;) {

        String enterLogin = JOptionPane.showInputDialog(null,"Login: ");
        String enterPassword = JOptionPane.showInputDialog(null,"Password: ");

            if (LOGIN.equals(enterLogin) && (PASSWORD.equals(enterPassword))) {
                JOptionPane.showMessageDialog(null, "Login e Password Aceitos!");
                i = 3;
            }
            else {
                i = i+1;
                JOptionPane.showMessageDialog(null, "A tentativa falhou! Verifique Login ou Password!! \n Você tem mais " + (3 - i) + " tentativa(s)!!");
            }
        }
    }
}
