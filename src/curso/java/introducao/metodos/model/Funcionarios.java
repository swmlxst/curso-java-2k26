package curso.java.introducao.metodos.model;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salario = {1200,4000,2000};

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    public void SalarioArray(double[] salario) {
    double soma = 0;
    for (double num: salario) {
        soma += num;
    }
        System.out.println(soma / 3);
    }
}