package com.utad.inso.tema1.entregas.ejercicio7;

public class Wind implements InstrumentInterface{
	
	public void play(Note n) {
		System.out.println("Wind.play() "  + n);
	}
	
	public String what() {
		return "Wind";
	}

}
