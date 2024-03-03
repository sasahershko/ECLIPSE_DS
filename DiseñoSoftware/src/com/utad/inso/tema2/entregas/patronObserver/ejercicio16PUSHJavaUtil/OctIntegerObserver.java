package com.utad.inso.tema2.entregas.patronObserver.ejercicio16PUSHJavaUtil;
import java.util.Observable;
import java.util.Observer;

public class OctIntegerObserver implements Observer{
    
    ConcreteIntegerSubject concreteIntegerSubject;

    public OctIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }
    @Override
    
    public void update(Observable observable, Object arg) {
        System.out.println("Oct as String: " + Integer.toOctalString(this.concreteIntegerSubject.getCondition()));
    }
    
}
