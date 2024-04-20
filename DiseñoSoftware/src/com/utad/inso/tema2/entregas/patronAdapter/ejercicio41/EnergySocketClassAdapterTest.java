package com.utad.inso.tema2.entregas.patronAdapter.ejercicio41;

public class EnergySocketClassAdapterTest {
    public static void main(String[] args) {
        EnergySocketAdapter socketAdapter =  new VoltAdapter(new Volt(120));

        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
    
        System.out.println("");

        //1, 10, 40 -> tienes que utilizarlo para algo 
    }
}
