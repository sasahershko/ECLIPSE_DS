package com.utad.inso.tema2.entregas.ejercicio12;

public class Square implements GeometricArea{
    
    public static final Double SIDE_POR_DEFECTO = 0.0;

    private Double side;
    private Double area;
    private ContextAreaStrategy contextSquare = new ContextAreaStrategy(new SquareAreaStrategy());

    public Square(){
        this(Square.SIDE_POR_DEFECTO);
    }
    public Square(Double side){
        this.side = side;
        this.area = contextSquare.CalculaArea(this.side);
    }

    public String toString(){
        return "Square [ side: " + this.side + ", area: " + this.area + " ]";
    }

    public Double getArea(){
        return this.area;
    }

    public Double getSide(){
        return this.side;
    }
}
