package com.utad.inso.tema2.entregas.ejercicio16PUSH;

public class OctIntegerObserver implements PushObserver{
    
    ConcreteIntegerSubject concreteIntegerSubject;

    public OctIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }
    @Override
    
    public void update(Object o) {
        System.out.println("Oct as String: " + Integer.toOctalString((Integer)o));
    }
    
}
