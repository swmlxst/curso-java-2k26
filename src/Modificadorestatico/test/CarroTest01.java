package Modificadorestatico.test;

import Modificadorestatico.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Mercedes",230);
        Carro c3 = new Carro("Audi", 280);
       Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
