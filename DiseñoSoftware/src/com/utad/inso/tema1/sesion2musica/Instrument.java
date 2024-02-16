package com.utad.inso.tema1.sesion2musica;

public abstract class Instrument {
	
	public abstract void play(Note note);
	
	public String what() {
		return "Instrument";
	}
}
