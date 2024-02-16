package com.utad.inso.tema1.entregas.ejercicio7;

public class MusicTest {
	
	static void tuneDO(InstrumentInterface instrument) {
		instrument.play(Note.DO); //delegación
	}
	
	static void tuneRE(InstrumentInterface instrument) {
		instrument.play(Note.RE); //delegación
	}
	
	static void tuneAll(InstrumentInterface[] orchesta) {
		for(InstrumentInterface i: orchesta) {
			tuneDO(i);
			tuneRE(i);
		}
	}
	
	public static void main(String[] args) {
		InstrumentInterface[] orchesta = { 
				new Wind(), new Percussion()
		};
		
		tuneAll(orchesta);
	}
}
