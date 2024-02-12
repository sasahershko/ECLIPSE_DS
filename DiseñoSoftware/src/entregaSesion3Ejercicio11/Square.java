package entregaSesion3Ejercicio11;

public class Square implements GeometricArea{
    
    public static final Double SIDE_POR_DEFECTO = 0.0;

    private Double side;
    private Double area;

    public Square(){
        this(Square.SIDE_POR_DEFECTO);
    }
    public Square(Double side){
        this.side = side;
    }

    public Double getSide(){
        return this.side;
    }

    public String toString(){
        return this + "[ side ()" + this.side + "), area (" + getArea() + ") ]";   
    }

    ////////////////////////////////////
    public Double getArea(){
        return this.side*this.side;
    }
}
