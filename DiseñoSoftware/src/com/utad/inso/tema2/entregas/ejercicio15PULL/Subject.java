package com.utad.inso.tema2.entregas.ejercicio15PULL;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObservers(Observer o);
}
