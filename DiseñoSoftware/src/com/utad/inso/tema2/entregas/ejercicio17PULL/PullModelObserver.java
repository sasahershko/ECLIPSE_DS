package com.utad.inso.tema2.entregas.ejercicio17PULL;
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

    public void update(Observable observable, Object o){
        //TODO - El observador se debe asegurar el tipo concreto de modelo observable
        System.out.println("[Pull protocol " + this.name + "] " + ((PullModelObservable)observable).getWeatherState());
    }

}
