package com.utad.inso.tema2.entregas.patronObserver.ejercicio16PUSHJavaUtil;
import java.util.Observable;
import java.util.Observer;

public class BinaryIntegerObserver implements Observer{

    ConcreteIntegerSubject concreteIntegerSubject;

    public BinaryIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("Binary Integer as String: " + Integer.toBinaryString(this.concreteIntegerSubject.getCondition()));
    }
}
