package com.utad.inso.tema1.entregas.ejercicio4;

public class Car{
    
    private String marca;
    private String modelo;
    private String color;
    //Es opcional que tenga motor
    private Engine motor;

    public Car(String marca, String modelo, String color){
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //En el caso de que queramos un motor lo setteamos
    public void setMotor(Engine motor){
        this.motor = motor;
    }

    public void encender(){
        System.out.println("Encendido.");
    }
    public void avanzar(){
        System.out.println(toString() + " avanzando...");
    }

    public String toString(){
        return "[Marca: " + this.marca + ", Modelo: " + this.modelo + ", Color: " + this.color + "]";
    }

    public static void main(String[] args) {
        Car electricCar = new Car("Tesla", "Model3", "rojo");
        Engine electricEngine = new Engine("Eléctrico");

        electricCar.setMotor(electricEngine);
        electricCar.motor.encender();
        electricCar.avanzar();
    }
}
