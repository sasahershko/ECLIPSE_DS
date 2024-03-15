package com.utad.inso.tema2.entregas.patronState.ejercicio25;
import java.util.concurrent.TimeUnit;

public class TrafficLightTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight= new TrafficLight();

        for(int i=0; i<7; i++){
            trafficLight.show();

            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }  
    
        }
    }
    
}
