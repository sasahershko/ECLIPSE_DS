package com.utad.inso.tema2.entregas.patronTemplate.ejercicio40;

public class KinderGardenActivityContext {
    private ServiceStrategy serviceStrategy;

    public KinderGardenActivityContext(){

    }

    public KinderGardenActivityContext(ServiceStrategy serviceStrategy){
        this.serviceStrategy = serviceStrategy;
    }

    public void setServiceStrategy(ServiceStrategy serviceStrategy){
        this.serviceStrategy = serviceStrategy;
    }

    public void applyServiceStrategy(){
        this.serviceStrategy.applyServiceStrategy();
    }
}
