package com.utad.inso.tema1.entregas.ejercicio1;

public class Engine {
    public final static String TIPO_POR_DEFECTO = "Eléctrico";

	private String tipo;
	
    //DELEGACIÓN DE CONSTRUCTORES
    public Engine(){
        this(Engine.TIPO_POR_DEFECTO);
    }
	public Engine(String tipo) {
		this.tipo = tipo;
	}
	
    //MÉTODO
	public void encender() {
		System.out.println("¡" + this.tipo + " encendido!");
	}
	
    public String toString(){
        return "[Tipo de motor: " + this.tipo + "]";  
    }

	public static void main(String[] args) {
        Engine engine = new Engine("Eléctrico");

        engine.encender();
        System.out.println(engine);
    }
}

