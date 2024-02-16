package com.utad.inso.tema1.sesion1;

public class ElectriCar {
	

	public static final String MARCA_POR_DEFECTO = "Peugeot";
	public static final String MODELO_POR_DEFECTO = "208";
	public static final String COLOR_POR_DEFECTO = "Blanco";
	
	private String marca;
	private String modelo;
	private String color;
	private Engine motor = new Engine("Electrico");
	
	//CONSTRUCTOR
	public ElectriCar() {
		this(ElectriCar.MARCA_POR_DEFECTO);
	}
	
	public ElectriCar(String marca) {
		this(marca, ElectriCar.MODELO_POR_DEFECTO);
	}
	public ElectriCar(String marca, String modelo) {
		this(marca, modelo, ElectriCar.COLOR_POR_DEFECTO);
	}
	
	public ElectriCar(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
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
	
	public void avanzar() {
		System.out.println("Avanzando...");
	}
	
	public void parar() {
		System.out.println("Parado.");
	}
	
	//MAIN
	public static void main(String[] args) {
		ElectriCar electric = new ElectriCar("Tesla", "Model 3", "rojo");
		
		electric.motor.encender();
		electric.avanzar();
	}

}
