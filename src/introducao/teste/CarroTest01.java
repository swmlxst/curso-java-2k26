package introducao.teste;

import introducao.model.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome, modelo e ano do carro, respectivamente: ");
        c1.Nome = sc.next();
        c1.Modelo = sc.next();
        c1.ano = sc.nextInt();

        System.out.println("Insira o nome, modelo e o ano de um segundo carro respectivamente: ");
        c2.Nome = sc.next();
        c2.Modelo = sc.next();
        c2.ano = sc.nextInt();

        System.out.print("Carro 1: ");
        System.out.println(c1.Nome);
        System.out.println(c1.Modelo);
        System.out.println(c1.ano);

        System.out.print("\nCarro 2: ");
        System.out.println(c2.Nome);
        System.out.println(c2.Modelo);
        System.out.println(c2.ano);
    }
}
