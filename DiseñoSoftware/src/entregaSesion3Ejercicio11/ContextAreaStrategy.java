package entregaSesion3Ejercicio11;

public class ContextAreaStrategy {
    
    private GeometricArea geometricArea;

    public ContextAreaStrategy(){
        //Si no recibe argumentos, el área por defecto será el del cuadrado
        this.geometricArea = new Square();
    }

    public ContextAreaStrategy(GeometricArea areaStrategy){
        this.geometricArea = areaStrategy;
    }

    public void CalculaArea(Double num){
        this.geometricArea.getArea();
    }

    //GETTERS Y SETTERS
    public void setAreaStrategy(GeometricArea areaStrategy){
        this.geometricArea = areaStrategy;
    }
    public GeometricArea getAreaStrategy(){
        return this.geometricArea;
    }
}
