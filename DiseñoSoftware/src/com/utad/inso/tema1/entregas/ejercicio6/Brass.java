package com.utad.inso.tema1.entregas.ejercicio6;

public class Brass extends Wind implements ElectricSound{

	public void electricPlay(Note n) {
		System.out.println("ElectricSound.Instrument.Brass.play() " + n);
		
	}

	public void play(Note note) {
		System.out.println("Instrument.Wind.Brass.Play()"  + note);
		
	}
	
	public String what() {
		return "Brass";
	}

}
