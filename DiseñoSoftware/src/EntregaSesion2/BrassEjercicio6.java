package EntregaSesion2;

public class BrassEjercicio6 extends WindEjercicio6 implements ElectricSoundEjercicio6{

	public void electricPlay(NoteEjercicio6 n) {
		System.out.println("ElectricSound.Instrument.Brass.play() " + n);
		
	}

	public void play(NoteEjercicio6 note) {
		System.out.println("Instrument.Wind.Brass.Play()"  + note);
		
	}
	
	public String what() {
		return "Brass";
	}

}
