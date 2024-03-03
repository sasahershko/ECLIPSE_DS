package com.utad.inso.tema2.entregas.patronStrategy.ejercicio9;

public class CamelCaseFormatterStrategy implements TextFormatterStrategy{

	@Override
	public void format(String text) {

		Boolean siguienteMayu = false;
		StringBuilder stringBuilder = new StringBuilder();
		String[] letras = text.split(""); //Separa elemento a elemento cada carácter en un array

		//Para cada letra dentro del array de letras
		for (String letra : letras) {

			//Comprobamos si es un espacio en blanco, e indica que la próxima será en mayu
			if(letra.equals(" ")){
				siguienteMayu = true; 
			}
			else if(siguienteMayu) {
				//Si es mayu, se añade la letra al stringBuilder
				stringBuilder.append(letra.toUpperCase());
				siguienteMayu = false;
			}
			else {
				//Si no, añadimos la minúscula
				stringBuilder.append(letra.toLowerCase());
			}
		}
		System.out.println("[CamelCaseStrategyFormatter]:" + stringBuilder);
	}

}
