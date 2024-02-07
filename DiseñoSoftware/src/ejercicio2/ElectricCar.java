package ejercicio2;

public class ElectricCar {
    
    private String marca;
    private String modelo;
    private String color;
    private Engine motor = new Engine("Electrico");

    public ElectricCar(String marca, String modelo, String color){
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
        ElectricCar electricCar = new ElectricCar("Tesla", "Model3", "rojo");

        electricCar.encender();
        electricCar.avanzar();
        electricCar.motor.encender();
    }
}
