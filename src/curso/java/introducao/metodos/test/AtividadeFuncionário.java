package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Funcionarios;

import java.util.Scanner;

public class AtividadeFuncionário {
    public static void main(String[] args) {
        Funcionarios f = new Funcionarios();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome e idade pra ver a média dos seus salário: ");
        f.nome = sc.nextLine();
        f.idade = sc.nextInt();

        f.imprimirDados();
        System.out.println("-------------");

        System.out.println("Salário 1: "+ f.salario[0]);
        System.out.println("Salário 2: "+ f.salario[1]);
        System.out.println("Salário 3: "+ f.salario[2]);
        System.out.println("-------------");
        f.SalarioArray(f.salario);

    }
}
