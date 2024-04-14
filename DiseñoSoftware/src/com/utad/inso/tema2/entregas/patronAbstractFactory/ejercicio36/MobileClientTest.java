package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class MobileClientTest {
    public static void main(String[] args) {
        MobileFactoryManager factoryManager = MobileFactoryManager.getInstance();

        Mobile myIphone = factoryManager.createIphone();
        Mobile mySamsung = factoryManager.createSamsung();

        System.out.println("");
    }
}
