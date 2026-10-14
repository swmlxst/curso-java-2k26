package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Calculadora;

public class CalcTest03 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double result = c.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
