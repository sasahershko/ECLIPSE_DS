package com.utad.inso.tema2.entregas.ejercicio16PUSH;

public interface PushSubject {
    public void attach(PushObserver o);
    public void detach(PushObserver o);
    public void notifyObservers();
}
