package introducao.teste;

import introducao.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Evanio";
        p1.idade = 67;
        p1.sexo = "M";

        System.out.println(p1.nome + ", " + p1.idade + " anos " + p1.sexo + "alpha");
    }
}
