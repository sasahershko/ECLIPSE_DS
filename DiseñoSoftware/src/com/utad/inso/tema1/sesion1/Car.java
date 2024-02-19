package com.utad.inso.tema1.sesion1;

public class Car {

	public static final String MARCA_POR_DEFECTO = "Peugeot";
	public static final String MODELO_POR_DEFECTO = "208";
	public static final String COLOR_POR_DEFECTO = "Blanco";
	
	private String marca;
	private String modelo;
	private String color;
	
	//CONSTRUCTOR
	public Car(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	

	public void avanzar() {
		System.out.println("Avanzando...");
	}
	
	public void parar() {
		System.out.println("Parado.");
	}
		//MAIN
	public static void main(String[] args) {
		Car myCar = new Car("Peugeot", "208", "rojo");
		//Car yourCar = new Car("Land Rover", "Discovery", "gris");
		
		//Movemos el Peugeout
		myCar.avanzar();
	}

}
