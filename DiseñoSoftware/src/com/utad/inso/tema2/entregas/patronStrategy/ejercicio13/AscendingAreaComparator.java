package com.utad.inso.tema2.entregas.patronStrategy.ejercicio13;
import java.util.Comparator;

public class AscendingAreaComparator implements Comparator<GeometricArea>{
    public int compare(GeometricArea geometricArea1, GeometricArea geometricArea2){
        return geometricArea1.getArea().compareTo(geometricArea2.getArea());
    }
    
}
