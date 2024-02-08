package EntregaSesion2;

public class WindEjercicio7 implements InstrumentInterfaceEjercicio7{
	
	public void play(NoteEjercicio7 n) {
		System.out.println("Wind.play() "  + n);
	}
	
	public String what() {
		return "Wind";
	}

}
