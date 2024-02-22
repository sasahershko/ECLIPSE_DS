package com.utad.inso.tema2.entregas.ejercicio15PULL;

import java.util.ArrayList;

public class ConcreteIntegerSubject implements Subject{
    
    private ArrayList<Observer> subjects;

    public ConcreteIntegerSubject(Subject subject){
        this.subjects = new ArrayList<Observer>();
    }

    public ArrayList<Observer> getSubjectState(){
        return this.subjects;
    }

    public void setSubjectState(ArrayList<Observer> subjects){
        this.subjects = subjects;
    }

    @Override
    public void attach(Observer o) {
        this.subjects.add(o);
    }

    @Override
    public void detach(Observer o) {
       this.subjects.remove(o);
    }

    @Override
    public void notifyObservers(Observer o) {
        for(Observer o: this.observers){
            o.update();
        }
    }   

}
