package com.utad.inso.tema1.entregas.ejercicio6;

public class Percussion extends Instrument{
    public void play(Note n) {
		System.out.println("Percussion.play() "  + n);
	}
	
	public String what() {
		return "Percussion";
	}
}
