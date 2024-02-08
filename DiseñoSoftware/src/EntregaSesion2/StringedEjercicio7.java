package entregaSesion2;

public class StringedEjercicio7 implements InstrumentInterfaceEjercicio7{
    public void play(NoteEjercicio7 n) {
		System.out.println("Stringed.play() "  + n);
	}
	
	public String what() {
		return "Stringed";
	}
}
