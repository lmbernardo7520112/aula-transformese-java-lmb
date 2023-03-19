package br.com.transformese.spring01;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        // criação e armazenamento dos objetos em uma lista
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", "123", 5000.0));
        funcionarios.add(new Assistente("Maria", "456", 2500.0));
        funcionarios.add(new Vendedor("Pedro", "789", 2000.0, 500.0));
        
    
        // cálculo da folha salarial e impressão dos salários
        double folhaSalarial = 0.0;
        for (Funcionario f : funcionarios) {
            double salario = f.calculaSalario();
            folhaSalarial += salario;
            System.out.println(f.getNome() + ": " + salario);
        }
        System.out.println("Folha salarial total: " + folhaSalarial);
    }
}