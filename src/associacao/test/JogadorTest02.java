package associacao.test;

import associacao.model.Jogador;
import associacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        j1.setTime(time);

        j1.inprime();
    }
}
