package com.utad.inso.tema1.entregas.ejercicio7;

public class Percussion implements InstrumentInterface{
    public void play(Note n) {
		System.out.println("Percussion.play() "  + n);
	}
	
	public String what() {
		return "Percussion";
	}
}
