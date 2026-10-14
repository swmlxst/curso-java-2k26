package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Calculadora;

public class CalcTest01 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.somaDoisNumeros();
        System.out.println("Finalizados");
        c.subtraiDoisNumeros();
    }
}
