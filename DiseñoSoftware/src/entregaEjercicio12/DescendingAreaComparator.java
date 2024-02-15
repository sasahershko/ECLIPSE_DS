package entregaEjercicio12;

public class DescendingAreaComparator{
    public int compare(GeometricArea geo1, GeometricArea geo2){
        return geo2.getArea().compareTo(geo1.getArea());
    }
}
