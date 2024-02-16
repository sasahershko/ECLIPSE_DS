package com.utad.inso.tema1.entregas.ejercicio6;

public class Wind extends Instrument{
	
	public void play(Note n) {
		System.out.println("Wind.play() "  + n);
	}
	
	public String what() {
		return "Wind";
	}

}
