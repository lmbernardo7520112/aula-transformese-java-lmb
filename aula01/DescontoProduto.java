package aula01;
import javax.swing.JOptionPane;

public class DescontoProduto {
    public static void main(String[] args) {
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        
        double valorDesconto = valorProduto * percentualDesconto / 100;
        double valorProdutoComDesconto = valorProduto - valorDesconto;
        
        JOptionPane.showMessageDialog(null, "Valor do desconto: R$ " + valorDesconto + "\nValor do produto com desconto: R$ " + valorProdutoComDesconto);
    }
}
