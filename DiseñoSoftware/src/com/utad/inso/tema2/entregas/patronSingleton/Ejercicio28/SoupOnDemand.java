package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio28;

import java.util.Objects;

public class SoupOnDemand {
    private static SoupOnDemand soupOnDemand;

    private SoupOnDemand(){}

    public static SoupOnDemand getInstance(){
        if(Objects.isNull((soupOnDemand))){
            SoupOnDemand.soupOnDemand= new SoupOnDemand();
        }   
        return SoupOnDemand.soupOnDemand;
    }

    public void ready(){
        System.out.println("Soup on demand is ready.");
    }
}
