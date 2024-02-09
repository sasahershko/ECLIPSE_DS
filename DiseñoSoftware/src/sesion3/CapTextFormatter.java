package sesion3;

public class CapTextFormatter implements TextFormatterStrategy{

	@Override
	public void format(String text) {
		System.out.println("[CapTextFormatter]: "+ text.toUpperCase());
	}

}
