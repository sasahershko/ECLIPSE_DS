package com.utad.inso.tema2.entregas.ejercicio12;

public class DescendingAreaComparator{
    public int compare(GeometricArea geometricArea1, GeometricArea geometricArea2){
        return geometricArea2.getArea().compareTo(geometricArea1.getArea());
    }
}
