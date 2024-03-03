package com.utad.inso.tema2.entregas.patronStrategy.ejercicio12;

public class Circle implements GeometricArea{
    //comparator simplemente llamarlo - no te rayes
    public static final Double RADIO_POR_DEFECTO = 0.0;

    private Double radius;
    private Double area;
    private ContextAreaStrategy contextCircle = new ContextAreaStrategy(new CircleAreaStrategy());

    public Circle(){
        this(Circle.RADIO_POR_DEFECTO);
    }
    public Circle(Double radius){
        this.radius = radius;
        this.area = contextCircle.CalculaArea(this.radius);
    }

    public Double getRadius(){
        return this.radius;
    }

    public Double getArea(){
        return this.area;
    }

    public String toString(){
        return "Circle [ side: " + this.radius + ", area: " + this.area + " ]";
    }
    public static void main(String[] args) {
        Circle circleExample = new Circle(1.0);

        System.out.println(circleExample);
    }
}
