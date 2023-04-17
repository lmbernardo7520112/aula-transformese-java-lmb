package br.com.transformese.spring01.exercicio09;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Rua A, 123", "12345678", 1, 1000.0, 10.0);

        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código do setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());
        System.out.println("Salário líquido: " + empregado1.calcularSalario());

    System.out.println();

    Empregado empregado2 = new Empregado();
    empregado2.setNome("Maria");
    empregado2.setEndereco("Rua B, 456");
    empregado2.setTelefone("87654321");
    empregado2.setCodigoSetor(2);
    empregado2.setSalarioBase(2000.0);
    empregado2.setImposto(20.0);

    System.out.println("Nome: " + empregado2.getNome());
    System.out.println("Endereço: " + empregado2.getEndereco());
    System.out.println("Telefone: " + empregado2.getTelefone());
    System.out.println("Código do setor: " + empregado2.getCodigoSetor());
    System.out.println("Salário base: " + empregado2.getSalarioBase());
    System.out.println("Imposto: " + empregado2.getImposto());
    System.out.println("Salário líquido: " + empregado2.calcularSalario());
    }
}
