package com.utad.inso.tema2.entregas.ejercicio15PULL;

public class BinaryIntegerObserver implements Observer{

    ConcreteIntegerSubject concreteIntegerSubject;

    @Override
    public void update() {
        //System.out.println("Binary Integer as String: " + Integer.toBinaryString(this.concreteIntegerSubject.getSubjectState()));
    }
    
}
