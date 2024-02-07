package ejercicio6;

public class MusicTest {
	
	static void tuneDO(Instrument instrument) {
		instrument.play(Note.DO); //delegación
	}
	
	static void tuneAll(Instrument[] orchesta) {
		for(Instrument i: orchesta) {
			tuneDO(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchesta = { 
				new Wind(), new Percussion()
		};
		
		tuneAll(orchesta);
	}
}
