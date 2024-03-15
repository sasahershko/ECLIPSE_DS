package com.utad.inso.tema2.entregas.patronState.ejercicio25;

public class TrafficLight {
    private TraficLightState trafficLightState;

    public TrafficLight(TraficLightState trafficLightState){
        super();
        this.trafficLightState=trafficLightState;
    }

    public TraficLightState getTrafficLightState(){
        return this.trafficLightState;
    }
    public void setTrafficLightState(TraficLightState trafficLightState){
        this.trafficLightState=trafficLightState;
    }


    public void show(){
        this.trafficLightState.show(this);
    }
}
