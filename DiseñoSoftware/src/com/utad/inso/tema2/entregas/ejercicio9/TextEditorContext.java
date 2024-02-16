package com.utad.inso.tema2.entregas.ejercicio9;

public class TextEditorContext {

	private TextFormatterStrategy textFormatterStrategy;

	public TextEditorContext() {
		//En caso de no pasarle un formateador, se utilizará echo por defecto
		this(new EchoFormatterStrategy());
	}

	public TextEditorContext(TextFormatterStrategy textFormatterStrategy) {
		//Establece la estrategia de formateo de texto proporcionada
		this.textFormatterStrategy = textFormatterStrategy;
	}

	//Aplica el método formato dependiendo de la estrategia que hayamos elegido
	public void format(String text) {
		textFormatterStrategy.format(text);
	}

	//Para poder cambiar la estrategia en tiempo de ejecución 
	public void setTextFormatterStrategy(TextFormatterStrategy textFormatterStategy) {
		this.textFormatterStrategy = textFormatterStategy;
	}
}
