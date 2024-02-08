package entregaSesion2;

public class EngineEjercicio2 {
    public final static String TIPO_POR_DEFECTO = "Eléctrico";

	private String tipo;
	
    //DELEGACIÓN DE CONSTRUCTORES
    public EngineEjercicio2(){
        this(EngineEjercicio2.TIPO_POR_DEFECTO);
    }
	public EngineEjercicio2(String tipo) {
		this.tipo = tipo;
	}
	
    //MÉTODO
	public void encender() {
		System.out.println("¡" + this.tipo + " encendido!");
	}
	
    public String toString(){
        return "[Tipo de motor: " + this.tipo + "]";  
    }

	public static void main(String[] args) {
        EngineEjercicio2 engine = new EngineEjercicio2("Eléctrico");

        engine.encender();
        System.out.println(engine);
    }
}

