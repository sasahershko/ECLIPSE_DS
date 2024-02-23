package com.utad.inso.tema2.entregas.ejercicio15PULL;

public interface PullSubject {
    public void attach(PullObserver o);
    public void detach(PullObserver o);
    public void notifyObservers();
}
