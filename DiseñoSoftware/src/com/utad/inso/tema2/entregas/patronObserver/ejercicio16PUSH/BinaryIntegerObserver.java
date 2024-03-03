package com.utad.inso.tema2.entregas.patronObserver.ejercicio16PUSH;

public class BinaryIntegerObserver implements PushObserver{

    ConcreteIntegerSubject concreteIntegerSubject;

    public BinaryIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }

    @Override
    public void update(Object o) {
        System.out.println("Binary Integer as String: " + Integer.toBinaryString((Integer)o));
    }
}
