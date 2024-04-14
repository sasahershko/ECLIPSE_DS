package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

public class DaemonGameTest {
    //(atributo)Power -> lko vamos a utilizar igual que las vidas
    //no es un atributo multiple, es un multiplicador (lo mismo por el spawner)
    //
    public static void main(String[] args) {
        GameController game = GameController.getInstance();
        game.play();
    }
}
