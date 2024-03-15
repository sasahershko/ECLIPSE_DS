package com.utad.inso.tema2.entregas.patronState.ejercicio25b;

public class AmberLightState implements TraficLightState{

    private TrafficLight trafficLight;

    public AmberLightState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void show(TrafficLight trafficLight) {
        System.out.println("Amber light, stop!");
        this.trafficLight.setTrafficLightState(new GreenLightState(trafficLight));
    }
    
}
