package Modificadorestatico.model;

public class Anime {
    private String nome;
    private static int[] episodios;
    // Bloco de inicialização é executado quando a JVM carregar classe
    // Alocado espaço em memória pra objeto
    // Cada atributo de classe é criado e inciializado com valores default ou o que for passada
    // Bloco de inicialização executado
    // Construtor e executada

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }
    {
        System.out.println("Bloco de inicialização não estatico");
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }


    public Anime(){

        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
    }
}
