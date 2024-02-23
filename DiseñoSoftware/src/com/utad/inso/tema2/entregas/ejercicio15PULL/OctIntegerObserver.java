package com.utad.inso.tema2.entregas.ejercicio15PULL;

public class OctIntegerObserver implements PullObserver{
    
    ConcreteIntegerSubject concreteIntegerSubject;

    public OctIntegerObserver(ConcreteIntegerSubject concreteIntegerSubject){
        this.concreteIntegerSubject = concreteIntegerSubject;
    }
    @Override
    
    public void update() {
        System.out.println("Oct as String: " + (this.concreteIntegerSubject.getCondition()));
    }
    
}
