package ejercicio4;

public class HerencyElectricCar extends Car{
    
    public HerencyElectricCar(String marca, String modelo, String motor){
        super(marca, modelo, motor);
    }

    public static void main(String[] args) {
        Car car = new HerencyElectricCar("Tesla", "Model3", "rojo");
    }
}
