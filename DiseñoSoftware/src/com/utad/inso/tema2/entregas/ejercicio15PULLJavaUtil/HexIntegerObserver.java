package com.utad.inso.tema2.entregas.ejercicio15PULLJavaUtil;
import java.util.Observable;
import java.util.Observer;

public class HexIntegerObserver implements Observer{

    ConcreteIntegerSubject concreteIntegerSubject;

    public HexIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("Hexadecimal as String: " + Integer.toHexString(this.concreteIntegerSubject.getCondition()));
    }
    
}
