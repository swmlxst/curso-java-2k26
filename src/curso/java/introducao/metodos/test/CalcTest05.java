package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Calculadora;

public class CalcTest05 {
    public static void main(String... args) {
        Calculadora c = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        c.somaArray(numeros);
        c.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}
