package com.utad.inso.tema1.sesion1;

public class Engine {
	
	//atributo que es el tipo 
	//tipo de motor: encendido (metodo publico endender() )
	//instancia en main que instancia motor tiop electrico y hacemos llamada a encender

	private String tipo;
	
	public Engine(String tipo) {
		this.tipo = tipo;
	}
	
	public void encender() {
		System.out.println(this.tipo + " encendido.");
	}
	
	
}
