package com.utad.inso.tema1.entregas.ejercicio0;

public class Car2 {

	public static final String MARCA_POR_DEFECTO = "Peugeot";
	public static final String MODELO_POR_DEFECTO = "208";
	public static final String COLOR_POR_DEFECTO = "Blanco";
	
	private String marca;
	private String modelo;
	private String color;
	
	//CONSTRUCTOR
	public Car2() {
		this(Car2.MARCA_POR_DEFECTO);
	}
	
	public Car2(String marca) {
		this(marca, Car2.MODELO_POR_DEFECTO);
	}
	public Car2(String marca, String modelo) {
		this(marca, modelo, Car2.COLOR_POR_DEFECTO);
	}
	public Car2(String marca, String modelo, String color) {
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
	
	//GETTERS Y SETTERS
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	//MAIN
	public static void main(String[] args) {
		Car2 myCar = new Car2("Peugeot", "208", "rojo");
		Car2 yourCar = new Car2("Land Rover", "Discovery", "gris");
		Car2 carEjemplo = new Car2();
		
		//Movemos el Peugeout
		myCar.avanzar();
		
		carEjemplo.setMarca("LandRover");
		carEjemplo.setModelo("208");
		carEjemplo.setColor("Rosa");
		carEjemplo.getMarca();
		carEjemplo.getModelo();
		carEjemplo.getColor();
	}

}
