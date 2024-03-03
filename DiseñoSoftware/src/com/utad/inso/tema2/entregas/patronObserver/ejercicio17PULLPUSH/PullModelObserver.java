package com.utad.inso.tema2.entregas.patronObserver.ejercicio17PULLPUSH;
import java.util.Observable;
import java.util.Observer;

public class PullModelObserver implements Observer{
    protected String name;

    public PullModelObserver(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void update(Observable observable, Object arg){
        System.out.println("[PULL protocol " + this.name + "] " + ((PullModelObservable)observable).getWeatherState());
        System.out.println();
        System.out.println("[PUSH protocol " + this.name + "] "+ arg);
        System.out.println();
    }

}
