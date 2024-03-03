package com.utad.inso.tema2.entregas.patronStrategy.ejercicio9;

public class LowerTextFormatter implements TextFormatterStrategy{

	//Se imprime en minúsculas
	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]: "+ text.toLowerCase());
		
	}

}
