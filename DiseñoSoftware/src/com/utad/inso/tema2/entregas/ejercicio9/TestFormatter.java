package com.utad.inso.tema2.entregas.ejercicio9;

public class TestFormatter {
	public static void main(String[] args) {

		//No cambiamos formato
		TextFormatterStrategy formatter = new EchoFormatterStrategy();
		TextEditorContext editor = new TextEditorContext(formatter);
		editor.format("Welcome to this Strategy editor.");
		
		//Mayúsculas
		formatter = new CapTextFormatter();
		editor.setTextFormatterStrategy(formatter);
		editor.format("Testing text in caps formatter.");

		//Minúsculas
		formatter = new LowerTextFormatter();
		editor.setTextFormatterStrategy(formatter);
		editor.format("Testing text in lower formatter.");
		
		//CamelCase
		formatter = new CamelCaseFormatterStrategy();
		editor.setTextFormatterStrategy(formatter);
		editor.format("Testing text in Camel Case.");
	}
}
