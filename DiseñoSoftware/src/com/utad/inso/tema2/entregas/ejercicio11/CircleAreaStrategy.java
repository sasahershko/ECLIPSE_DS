package com.utad.inso.tema2.entregas.ejercicio11;

public class CircleAreaStrategy implements AreaStrategy {
    
    public Double CalculaArea(Double num){                  
       return Math.PI*Math.pow(num,2);
    }
}
