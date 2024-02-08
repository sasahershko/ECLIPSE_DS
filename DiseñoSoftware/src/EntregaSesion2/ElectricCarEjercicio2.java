package EntregaSesion2;

public class ElectricCarEjercicio2 {
    
    private String marca;
    private String modelo;
    private String color;
    private EngineEjercicio2 motor = new EngineEjercicio2("Electrico");

    public ElectricCarEjercicio2(String marca, String modelo, String color){
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void encender(){
        System.out.println("Encendido.");
    }

    public void avanzar(){
        System.out.println(toString() + " avanzando...");
    }

    public String toString(){
        return "[Marca: " + this.marca + ", Modelo: " + this.modelo + ", Color: " + this.color + "]";
    }

    public static void main(String[] args) {
        ElectricCarEjercicio2 electricCar = new ElectricCarEjercicio2("Tesla", "Model3", "rojo");

        electricCar.encender();
        electricCar.avanzar();
        electricCar.motor.encender();
    }
}
