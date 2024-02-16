package com.utad.inso.tema2.entregas.ejercicio12;

public class AscendingAreaComparator{
    public int compare(GeometricArea geometricArea1, GeometricArea geometricArea2){
        return geometricArea1.getArea().compareTo(geometricArea2.getArea());
    }
    
}
