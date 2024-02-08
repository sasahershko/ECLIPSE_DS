package EntregaSesion2;

public class HerencyElectricCarEjercicio4 extends CarEjercicio3{
    
    public HerencyElectricCarEjercicio4(String marca, String modelo, String motor){
        super(marca, modelo, motor);
    }

    public static void main(String[] args) {
        CarEjercicio3 car = new HerencyElectricCarEjercicio4("Tesla", "Model3", "rojo");
    }
}
