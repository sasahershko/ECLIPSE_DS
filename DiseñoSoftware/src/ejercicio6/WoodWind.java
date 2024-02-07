package ejercicio6;

public class WoodWind extends Wind {

	public void electricPlay(Note n) {
		System.out.println("ElectricSound.Instrument.WoodWind.play() " + n);
		
	}

	public void play(Note note) {
		System.out.println("Instrument.Wind.WoodWind.Play()"  + note);
		
	}
	
	public String what() {
		return "WoodWind";
	}
}
