package curso.java.introducao.metodos.model;

public class Estudante {
    public String nome;
    public int idade;
    public String sexo;

   public void imprime(){
       System.out.println("-----");
       System.out.println("Nome: "+this.nome);
       System.out.println("Idade: "+this.idade);
       System.out.println("Sexo: "+this.sexo);
   }
}
