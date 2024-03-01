package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public interface PushSubject {
    public void attach(PushObserver o);
    public void detach(PushObserver o);
    public void notifyObservers();
}

