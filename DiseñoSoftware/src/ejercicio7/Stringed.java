package ejercicio7;

public class Stringed implements InstrumentInterface{
    public void play(Note n) {
		System.out.println("Stringed.play() "  + n);
	}
	
	public String what() {
		return "Stringed";
	}
}
