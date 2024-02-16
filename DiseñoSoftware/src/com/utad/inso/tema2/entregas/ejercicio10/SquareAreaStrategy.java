package com.utad.inso.tema2.entregas.ejercicio10;

public class SquareAreaStrategy implements AreaStrategy{

    public void CalculaArea(Double num){  
                                                        //El número en este caso es el radio
        System.out.println("El área del cuadrado es de: " + String.format("%.2f", num*num) + " cms."); //String format es para que salgan sólo 2 decimales
    } 
}
