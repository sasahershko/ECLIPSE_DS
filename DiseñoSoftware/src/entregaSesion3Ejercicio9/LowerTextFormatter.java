package entregaSesion3Ejercicio9;

public class LowerTextFormatter implements TextFormatterStrategy{

	//Se imprime en minúsculas
	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]: "+ text.toLowerCase());
		
	}

}
