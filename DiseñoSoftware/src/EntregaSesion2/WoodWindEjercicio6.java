package entregaSesion2;

public class WoodWindEjercicio6 extends WindEjercicio6 {

	public void electricPlay(NoteEjercicio6 n) {
		System.out.println("ElectricSound.Instrument.WoodWind.play() " + n);
		
	}

	public void play(NoteEjercicio6 note) {
		System.out.println("Instrument.Wind.WoodWind.Play()"  + note);
		
	}
	
	public String what() {
		return "WoodWind";
	}
}
