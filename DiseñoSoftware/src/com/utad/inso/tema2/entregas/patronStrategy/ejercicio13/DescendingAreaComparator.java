package com.utad.inso.tema2.entregas.patronStrategy.ejercicio13;
import java.util.Comparator;

public class DescendingAreaComparator implements Comparator<GeometricArea>{
    public int compare(GeometricArea geometricArea1, GeometricArea geometricArea2){
        return geometricArea2.getArea().compareTo(geometricArea1.getArea());
    }
}
