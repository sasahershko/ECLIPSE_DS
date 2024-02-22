package com.utad.inso.tema2.entregas.ejercicio15PULL;

import java.util.HexFormat;

public class HexIntegerObserver implements Observer{

    ConcreteIntegerSubject concreteIntegerSubject;

    @Override
    public void update() {
        // System.out.println("Hexadecimal as String: " + (this.concreteIntegerSubject.getSubjectState()));
    }
    
}
