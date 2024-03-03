package com.utad.inso.tema2.entregas.patronStrategy.ejercicio10;

public class CircleAreaStrategy implements AreaStrategy {
    
    public void CalculaArea(Double num){
                                                                        //El número en este caso es el lado
        System.out.println("El área del círculo es de: " + String.format("%.2f",Math.PI*Math.pow(num,2)) + " cms."); //String format es para que salgan sólo 2 decimales

    }
}
