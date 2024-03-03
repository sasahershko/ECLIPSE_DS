package com.utad.inso.tema2.entregas.patronObserver.ejercicio16PUSH;
import java.util.ArrayList;

public class ConcreteIntegerSubject implements PushSubject{
    
    private ArrayList<PushObserver> observers;
    private Integer condition;

    public ConcreteIntegerSubject(){
        this(0);
    }

    public ConcreteIntegerSubject(Integer condition){
        this(condition, new ArrayList<PushObserver>());
    }

    public ConcreteIntegerSubject(Integer condition, ArrayList<PushObserver> arrayList){
        this.condition=condition;
        this.observers = new ArrayList<PushObserver>();
    }

    public ArrayList<PushObserver> getSubjectState(){
        return this.observers;
    }

    public void setSubjectState(ArrayList<PushObserver> observers){
        this.observers = observers;
    }

    public Integer getCondition(){
        return this.condition;
    }

    public void setCondition(Integer condition){
        this.condition=condition;
        this.notifyObservers();
    }

    @Override
    public void attach(PushObserver o) {
        this.observers.add(o);
    }

    @Override
    public void detach(PushObserver o) {
       this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(PushObserver o: this.observers){
            o.update(this.condition);
        }
    }   

}
