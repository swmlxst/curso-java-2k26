package Construtores.dominio.model.test;

import sobrecargametodos.dominio.model.anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        anime ani = new anime();
        ani.setGenero("Drama");
        ani.imprime();
    }
}
