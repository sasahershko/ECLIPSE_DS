package entregaSesion2;

public class WoodWindEjercicio7 extends WindEjercicio7 {

	public void electricPlay(NoteEjercicio7 n) {
		System.out.println("ElectricSound.Instrument.WoodWind.play() " + n);
		
	}

	public void play(NoteEjercicio7 note) {
		System.out.println("Instrument.Wind.WoodWind.Play()"  + note);
		
	}
	
	public String what() {
		return "WoodWind";
	}
}
