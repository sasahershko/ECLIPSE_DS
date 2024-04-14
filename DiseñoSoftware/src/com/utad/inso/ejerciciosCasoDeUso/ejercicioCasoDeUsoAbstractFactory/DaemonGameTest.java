package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class DaemonGameTest {
    public static void main(String[] args) {
        //TODO Accede al objeto único aplicando patrón Singleton a GameController y utiliza la instnciación en static
        GameController game = GameController.getInstance();
        game.play();

        //TODO dentro del método play, implementa el código  que permita confirmar que se cumplen estadísticamente las proporciones de  enemigos en cada mundo
        
    }
}
