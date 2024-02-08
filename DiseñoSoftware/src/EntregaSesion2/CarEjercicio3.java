package EntregaSesion2;

public class CarEjercicio3{
    
    private String marca;
    private String modelo;
    private String color;
    //Es opcional que tenga motor
    private EngineEjercicio3 motor;

    public CarEjercicio3(String marca, String modelo, String color){
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //En el caso de que queramos un motor lo setteamos
    public void setMotor(EngineEjercicio3 motor){
        this.motor = motor;
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
        CarEjercicio3 electricCar = new CarEjercicio3("Tesla", "Model3", "rojo");
        EngineEjercicio3 electricEngine = new EngineEjercicio3("Eléctrico");

        electricCar.setMotor(electricEngine);
        electricCar.motor.encender();
        electricCar.avanzar();
    }
}
