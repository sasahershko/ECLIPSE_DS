package com.utad.inso.tema1.entregas.ejercicio6;

public class Stringed extends Instrument{
    public void play(Note n) {
		System.out.println("Stringed.play() "  + n);
	}
	
	public String what() {
		return "Stringed";
	}
}
