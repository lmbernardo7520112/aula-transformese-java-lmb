package br.com.transformese.spring01.exercicioVendedor;



public class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    
    @Override
    public double calculaSalario() {
        return getSalarioBase() * 2.0;
    }
}
