package ejercicio6;

public class MusicTest {
	
	static void tuneDO(Instrument instrument) {
		instrument.play(Note.DO); //delegación
	}
	
	static void tuneRE(Instrument instrument) {
		instrument.play(Note.RE); //delegación
	}
	
	static void tuneAll(Instrument[] orchesta) {
		for(Instrument i: orchesta) {
			tuneDO(i);
			tuneRE(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchesta = { 
				new Wind(), new Wind()
		};
		
		tuneAll(orchesta);
	}
}
