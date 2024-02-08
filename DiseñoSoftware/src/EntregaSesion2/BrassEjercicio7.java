package EntregaSesion2;

public class BrassEjercicio7 extends WindEjercicio7 implements ElectricSoundEjercicio7{

	public void electricPlay(NoteEjercicio7 n) {
		System.out.println("ElectricSound.Instrument.Brass.play() " + n);
		
	}

	public void play(NoteEjercicio7 note) {
		System.out.println("Instrument.Wind.Brass.Play()"  + note);
		
	}
	
	public String what() {
		return "Brass";
	}

}
