package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class DaemonGameTest {
    public static void main(String[] args) {
        //Accede al objeto único aplicando patrón Singleton a GameController y utiliza la instnciación en static
        GameController game = GameController.getInstance();
        //dentro del método play, implementa el código  que permita confirmar que se cumplen estadísticamente las proporciones de  enemigos en cada mundo (HECHO)
        game.play(); 
    }
}
