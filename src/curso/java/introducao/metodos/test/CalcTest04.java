package curso.java.introducao.metodos.test;

import curso.java.introducao.metodos.model.Calculadora;

public class CalcTest04 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        c.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do alteraDoisnumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
