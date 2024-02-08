package EntregaSesion2;

public class MusicTestEjercicio6 {
	
	static void tuneDO(InstrumentEjercicio6 instrument) {
		instrument.play(NoteEjercicio6.DO); //delegación
	}
	
	static void tuneAll(InstrumentEjercicio6[] orchesta) {
		for(InstrumentEjercicio6 i: orchesta) {
			tuneDO(i);
		}
	}
	
	public static void main(String[] args) {
		InstrumentEjercicio6[] orchesta = { 
				new WindEjercicio6(), new PercussionEjercicio6()
		};
		
		tuneAll(orchesta);
	}
}
