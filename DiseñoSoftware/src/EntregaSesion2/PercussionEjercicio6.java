package EntregaSesion2;

public class PercussionEjercicio6 extends InstrumentEjercicio6{
    public void play(NoteEjercicio6 n) {
		System.out.println("Percussion.play() "  + n);
	}
	
	public String what() {
		return "Percussion";
	}
}
