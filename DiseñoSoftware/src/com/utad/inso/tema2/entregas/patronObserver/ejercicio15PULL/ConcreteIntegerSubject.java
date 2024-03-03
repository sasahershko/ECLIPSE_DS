package com.utad.inso.tema2.entregas.patronObserver.ejercicio15PULL;
import java.util.ArrayList;

public class ConcreteIntegerSubject implements PullSubject{
    
    private ArrayList<PullObserver> observers;
    private Integer condition;

    public ConcreteIntegerSubject(){
        this(0);
    }

    public ConcreteIntegerSubject(Integer condition){
        this(condition, new ArrayList<PullObserver>());
    }

    public ConcreteIntegerSubject(Integer condition, ArrayList<PullObserver> arrayList){
        this.condition=condition;
        this.observers = new ArrayList<PullObserver>();
    }

    public ArrayList<PullObserver> getSubjectState(){
        return this.observers;
    }

    public void setSubjectState(ArrayList<PullObserver> observers){
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
    public void attach(PullObserver o) {
        this.observers.add(o);
    }

    @Override
    public void detach(PullObserver o) {
       this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(PullObserver o: this.observers){
            //En este caso actualizamos objeto, mientras que en el pull actualizaremos el Integer (caso concreto)
            o.update();
        }
    }   

}
