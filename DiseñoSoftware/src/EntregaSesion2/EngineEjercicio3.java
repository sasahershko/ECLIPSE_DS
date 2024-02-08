package EntregaSesion2;

public class EngineEjercicio3 {
    public final static String TIPO_POR_DEFECTO = "Eléctrico";

	private String tipo;
	
    //DELEGACIÓN DE CONSTRUCTORES
    public EngineEjercicio3(){
        this(EngineEjercicio3.TIPO_POR_DEFECTO);
    }
	public EngineEjercicio3(String tipo) {
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
        EngineEjercicio3 engine = new EngineEjercicio3("Eléctrico");

        engine.encender();
        System.out.println(engine);
    }
}

