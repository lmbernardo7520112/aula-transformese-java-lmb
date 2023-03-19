package br.com.transformese.spring01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;
    
    public Funcionario(String nome, String matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salario_base;
    }

    public abstract double calculaSalario();
}

