package br.com.transformese.spring01.exercicioVendedor;
public class Vendedor extends Funcionario {
    private double comissao;
    
    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }
    
    @Override
    public double calculaSalario() {
        return getSalarioBase() + comissao;
    }
}
