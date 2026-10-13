package introducao.teste;

import introducao.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante est = new Estudante();
         est.idade = 10;
         est.nome = "Jarlos";
         est.sexo = "M";

        System.out.println(est.nome);
        System.out.println(est.sexo);
        System.out.println(est.idade);

    }
}
