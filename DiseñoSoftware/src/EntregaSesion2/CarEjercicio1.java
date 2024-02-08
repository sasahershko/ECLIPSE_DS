package EntregaSesion2;

public class CarEjercicio1{
    
    private String marca;
    private String modelo;
    private String color;
    //Es opcional que tenga motor ? - relación débil
    private EngineEjercicio1 motor;

    public CarEjercicio1(String marca, String modelo, String color, EngineEjercicio1 motor){
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    //En el caso de que queramos un motor lo setteamos
    public void setMotor(EngineEjercicio1 motor){
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
        EngineEjercicio1 electricEngine = new EngineEjercicio1("Eléctrico");
        CarEjercicio1 electricCar = new CarEjercicio1("Tesla", "Model3", "rojo", electricEngine);


        //electricCar.setMotor(electricEngine);
        electricCar.motor.encender();
        electricCar.avanzar();
    }
}
