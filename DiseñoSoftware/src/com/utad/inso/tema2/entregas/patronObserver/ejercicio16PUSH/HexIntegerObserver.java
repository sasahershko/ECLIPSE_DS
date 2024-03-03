package com.utad.inso.tema2.entregas.patronObserver.ejercicio16PUSH;

public class HexIntegerObserver implements PushObserver{

    ConcreteIntegerSubject concreteIntegerSubject;

    public HexIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }

    @Override
    public void update(Object o) {
        System.out.println("Hexadecimal as String: " + Integer.toHexString((int)o));
    }
    
}
