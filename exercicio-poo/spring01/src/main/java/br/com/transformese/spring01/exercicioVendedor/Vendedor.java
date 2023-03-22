package br.com.transformese.spring01.exercicioVendedor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {}

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double salario = super.calcularSalario();
        salario += (valorVendas * comissao / 100);
        return salario;
    }
}

