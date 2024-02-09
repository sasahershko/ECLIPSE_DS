package entregaSesion3Ejercicio9;

public class EchoFormatterStrategy implements TextFormatterStrategy{

	//Imprimimos el texto sin formato, se imprime de la misma forma que lo hemos pasado por parámetro
	@Override
	public void format(String text) {
		System.out.println("[EchoFormatterStrategy]: " + text);
	}

}
