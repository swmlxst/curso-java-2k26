package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Marcella");
        p1.setIdade(70);
        // p1.imprime();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

    }
}
