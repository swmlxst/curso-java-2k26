package curso.java.introducao.metodos.model;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Funcionarios {
    private String nome;
    private int idade;
    private double media;
    private double[] salario;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

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