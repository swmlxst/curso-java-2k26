package introducao.teste;

import introducao.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();

        est.nome = "Sanji";
        System.out.println(est.nome);
        System.out.println(est.sexo);
        System.out.println(est.idade);
        System.out.println("---------");


        System.out.println(est2.sexo);
        System.out.println(est2.nome);
        System.out.println(est2.idade);
    }
}
