package blocosinicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;
    // Alocado espaço em memória pra objeto
    //Cada atributo de classe é criado e inciializado com valores default ou o que for passada
    //Bloco de inicialização executado
    //Construtor e executada

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
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

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public Anime(){

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }
}
