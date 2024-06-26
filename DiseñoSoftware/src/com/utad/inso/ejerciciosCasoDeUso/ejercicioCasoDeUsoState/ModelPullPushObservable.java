package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public interface ModelPullPushObservable {
    public void attach(ModelPullPushObserver o);
    public void detach(ModelPullPushObserver o);
    public void notifyObservers(Object o);
}
