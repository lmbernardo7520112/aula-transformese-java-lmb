package br.com.transformese.spring01.exercicio09;


import br.com.transformese.spring01.exercicioVendedor.Operario;
import br.com.transformese.spring01.exercicioVendedor.Vendedor;

public class TesteApp1 {

    public static void main(String[] args) {

        // Teste da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setEndereco("Rua A, 123");
        pessoa1.setTelefone("12345678");

        Pessoa pessoa2 = new Pessoa("Maria", "Rua B, 456", "87654321");

        System.out.println("=== Teste da classe Pessoa ===");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        System.out.println();

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());

        Empregado empregado = new Empregado("Empregado 1", "Rua B, 456", "87654321", 1, 2000.0, 10.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário líquido: " + empregado.calcularSalario());

        // Teste da classe Empregado
        Empregado empregado1 = new Empregado();
        empregado1.setNome("João");
        empregado1.setEndereco("Rua A, 123");
        empregado1.setTelefone("12345678");
        empregado1.setCodigoSetor(1);
        empregado1.setSalarioBase(3000.0);
        empregado1.setImposto(15.0);

        Empregado empregado2 = new Empregado("Maria", "Rua B, 456", "87654321", 2, 2000.0, 20.0);

        System.out.println();
        System.out.println("=== Teste da classe Empregado ===");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código do setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());
        System.out.println("Salário líquido: " + empregado1.calcularSalario());

        System.out.println();

        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Endereço: " + empregado2.getEndereco());
        System.out.println("Telefone: " + empregado2.getTelefone());
        System.out.println("Código do setor: " + empregado2.getCodigoSetor());
        System.out.println("Salário base: " + empregado2.getSalarioBase());
        System.out.println("Imposto: " + empregado2.getImposto());
        System.out.println("Salário líquido: " + empregado2.calcularSalario());

        // Teste da classe Administrador
        Administrador adm1 = new Administrador("João", "Rua A, 123", "12345678", 1, 3000.0, 15.0, 500.0);

        Administrador adm2 = new Administrador();
        adm2.setNome("Maria");
        adm2.setEndereco("Rua B, 456");
        adm2.setTelefone("87654321");
        adm2.setCodigoSetor(2);
        adm2.setSalarioBase(2000.0);
        adm2.setImposto(20.0);
        adm2.setAjudaDeCusto(800.0);
    
        System.out.println();
        System.out.println("=== Teste da classe Administrador ===");
        System.out.println("Nome: " + adm1.getNome());
        System.out.println("Endereço: " + adm1.getEndereco());
        System.out.println("Telefone: " + adm1.getTelefone());
        System.out.println("Código do setor: " + adm1.getCodigoSetor());
        System.out.println("Salário base: " + adm1.getSalarioBase());
        System.out.println("Imposto: " + adm1.getImposto());
        System.out.println("Ajuda de custo: " + adm1.getAjudaDeCusto());
        System.out.println("Salário líquido: " + adm1.calcularSalario());
    
        System.out.println();
    
        System.out.println("Nome: " + adm2.getNome());
        System.out.println("Endereço: " + adm2.getEndereco());
        System.out.println("Telefone: " + adm2.getTelefone());
        System.out.println("Código do setor: " + adm2.getCodigoSetor());
        System.out.println("Salário base: " + adm2.getSalarioBase());
        System.out.println("Imposto: " + adm2.getImposto());
        System.out.println("Ajuda de custo: " + adm2.getAjudaDeCusto());
        System.out.println("Salário líquido: " + adm2.calcularSalario());

         // Teste da classe operario

        System.out.println();
        System.out.println("=== Teste da classe Operário ===");
        Operario operario1 = new Operario("João Silva", "Rua A, 123", "(31) 98765-4321", 1, 2000.0, 10.0, 5000.0, 5.0);

        System.out.println("Nome: " + operario1.getNome());
        System.out.println("Endereço: " + operario1.getEndereco());
        System.out.println("Telefone: " + operario1.getTelefone());
        System.out.println("Código do setor: " + operario1.getCodigoSetor());
        System.out.println("Salário base: " + operario1.getSalarioBase());
        System.out.println("Imposto: " + operario1.getImposto());
        System.out.println("Valor produção: " + operario1.getValorProducao());
        System.out.println("Comissão: " + operario1.getComissao());
        System.out.println("Salário: " + operario1.calcularSalario());


        System.out.println();
        System.out.println("=== Teste da classe Vendedor ===");
        Vendedor vendedor = new Vendedor("João", "Rua A, 123", "555-1234", 1, 2000, 10, 5000, 5);
        double salario = vendedor.calcularSalario();
        System.out.println("Salário do vendedor " + vendedor.getNome() + ": R$" + salario);
    }

    
}
    
    
