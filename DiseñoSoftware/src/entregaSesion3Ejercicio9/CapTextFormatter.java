package entregaSesion3Ejercicio9;

public class CapTextFormatter implements TextFormatterStrategy{

	//Se imprime en Mayúsculas
	@Override
	public void format(String text) {
		System.out.println("[CapTextFormatter]: "+ text.toUpperCase());
	}

}
