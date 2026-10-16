package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Funcionarios;

import java.util.Scanner;

public class AtividadeFuncionário {
    public static void main(String[] args) {
        Funcionarios f = new Funcionarios();
        Scanner sc = new Scanner(System.in);

      f.setNome("Sanji");
      f.setIdade(69);
      f.setSalario(new double[]{124, 12413, 12312});
      f.imprimirDados();
    }
}
