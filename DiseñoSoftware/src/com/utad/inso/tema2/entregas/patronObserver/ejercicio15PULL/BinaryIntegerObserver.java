package com.utad.inso.tema2.entregas.patronObserver.ejercicio15PULL;

public class BinaryIntegerObserver implements PullObserver{

    ConcreteIntegerSubject concreteIntegerSubject;

    public BinaryIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }

    @Override
    public void update() {
        System.out.println("Binary Integer as String: " + Integer.toBinaryString(this.concreteIntegerSubject.getCondition()));
    }
}
