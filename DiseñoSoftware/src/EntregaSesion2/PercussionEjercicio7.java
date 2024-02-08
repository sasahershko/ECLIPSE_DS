package entregaSesion2;

public class PercussionEjercicio7 implements InstrumentInterfaceEjercicio7{
    public void play(NoteEjercicio7 n) {
		System.out.println("Percussion.play() "  + n);
	}
	
	public String what() {
		return "Percussion";
	}
}
