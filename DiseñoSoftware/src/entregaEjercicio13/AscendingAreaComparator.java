package entregaEjercicio13;

public class AscendingAreaComparator{
    public int compare(GeometricArea geo1, GeometricArea geo2){
        return geo1.getArea().compareTo(geo2.getArea());
    }
    
}
