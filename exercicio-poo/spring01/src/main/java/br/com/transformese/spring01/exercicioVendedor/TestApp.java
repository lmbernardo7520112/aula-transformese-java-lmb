package br.com.transformese.spring01.exercicioVendedor;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        // criação e armazenamento dos objetos em uma lista
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", "123", 5000.0));
        funcionarios.add(new Assistente("Maria", "456", 2500.0));
        funcionarios.add(new Vendedor("Pedro", "789", 2000.0, 500.0));
        
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "Rua A, 123", "12345678", 5000.0, 2000.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor do crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    
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