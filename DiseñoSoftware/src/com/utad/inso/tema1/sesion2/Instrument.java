package com.utad.inso.tema1.sesion2;

public abstract class Instrument {
	
	public abstract void play(Note note);
	
	public String what() {
		return "Instrument";
	}
}
