package com.utad.inso.tema1.sesion2;

public class Wind extends Instrument{
	
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() "  + n);
	}
	
	@Override
	public String what() {
		return "Wind";
	}
}
