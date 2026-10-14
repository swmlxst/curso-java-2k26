package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Estudante;
import curso.java.introducao.metodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante es = new Estudante();
        Estudante es2 = new Estudante();
        ImpressoraEstudante imp = new ImpressoraEstudante();

        es.nome = "Carlos";
        es.idade = 23;
        es.sexo = "M";

        es2.nome = "Pedro";
        es2.idade = 24;
        es2.sexo = "F";

        imp.imprime(es);
        imp.imprime(es2);

        System.out.println(es.nome);
        System.out.println(es.idade);
        System.out.println(es.sexo);

        System.out.println("--------------");

        System.out.println(es2.nome);
        System.out.println(es2.idade);
        System.out.println(es2.sexo);

    }
}
