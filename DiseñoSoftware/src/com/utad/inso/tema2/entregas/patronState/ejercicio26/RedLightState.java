package com.utad.inso.tema2.entregas.patronState.ejercicio26;

public class RedLightState implements TraficLightState{

    private TrafficLight trafficLight;

    public RedLightState(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    @Override
    public void show(TrafficLight trafficLight) {
        System.out.println("Red light, stop and wait!");
        this.trafficLight.setTrafficLightState(new GreenLightState(trafficLight));
    }
    
}
