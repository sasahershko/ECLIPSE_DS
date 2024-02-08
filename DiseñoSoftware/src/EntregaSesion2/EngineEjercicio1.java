package entregaSesion2;

public class EngineEjercicio1 {
    public final static String TIPO_POR_DEFECTO = "Eléctrico";

	private String tipo;
	
    //DELEGACIÓN DE CONSTRUCTORES
    public EngineEjercicio1(){
        this(EngineEjercicio1.TIPO_POR_DEFECTO);
    }
	public EngineEjercicio1(String tipo) {
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
        EngineEjercicio1 engine = new EngineEjercicio1("Eléctrico");

        engine.encender();
        System.out.println(engine);
    }
}

