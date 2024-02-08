package entregaSesion2;

public class MusicTestEjercicio7 {
	
	static void tuneDO(InstrumentInterfaceEjercicio7 instrument) {
		instrument.play(NoteEjercicio7.DO); //delegación
	}
	
	static void tuneRE(InstrumentInterfaceEjercicio7 instrument) {
		instrument.play(NoteEjercicio7.RE); //delegación
	}
	
	static void tuneAll(InstrumentInterfaceEjercicio7[] orchesta) {
		for(InstrumentInterfaceEjercicio7 i: orchesta) {
			tuneDO(i);
			tuneRE(i);
		}
	}
	
	public static void main(String[] args) {
		InstrumentInterfaceEjercicio7[] orchesta = { 
				new WindEjercicio7(), new PercussionEjercicio7()
		};
		
		tuneAll(orchesta);
	}
}
