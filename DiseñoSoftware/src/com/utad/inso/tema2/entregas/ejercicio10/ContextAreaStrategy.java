package com.utad.inso.tema2.entregas.ejercicio10;

public class ContextAreaStrategy {
    
    private AreaStrategy areaStrategy;

    public ContextAreaStrategy(){
        //Si no recibe argumentos, el área por defecto será el del cuadrado
        this.areaStrategy = new SquareAreaStrategy();
    }

    public ContextAreaStrategy(AreaStrategy areaStrategy){
        this.areaStrategy = areaStrategy;
    }

    public void CalculaArea(Double num){
        this.areaStrategy.CalculaArea(num);
    }

    //GETTERS Y SETTERS
    public void setAreaStrategy(AreaStrategy areaStrategy){
        this.areaStrategy = areaStrategy;
    }
    public AreaStrategy getAreaStrategy(){
        return this.areaStrategy;
    }
}
