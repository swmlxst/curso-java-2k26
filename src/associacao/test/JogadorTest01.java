package associacao.test;

import associacao.model.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Neymar");
        Jogador[] jogadores = {j1,j2,j3};
       for (Jogador jogador : jogadores) {
           jogador.inprime();
       }
    }
}
