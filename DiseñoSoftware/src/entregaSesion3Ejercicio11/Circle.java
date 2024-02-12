package entregaSesion3Ejercicio11;

public class Circle implements GeometricArea{
    
    public static final Double RADIO_POR_DEFECTO = 0.0;

    private Double radius;
    private Double area;

    //EL RADIO DEBE ESTAR, EL ÁREA LO SACAMOS CON EL MÉTODO GETAREA (?)
    public Circle(){
        this(Circle.RADIO_POR_DEFECTO);
    }
    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
