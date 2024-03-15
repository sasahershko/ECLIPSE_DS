package com.utad.inso.tema2.entregas.patronState.ejercicio25;

public class GreenLightState implements TraficLightState{
    private TrafficLight trafficLight;

    public GreenLightState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void show(TrafficLight trafficLight) {
        System.out.println("Green light, go forward");
        this.trafficLight.setTrafficLightState(new AmberLightState(trafficLight));
    }
    
}
