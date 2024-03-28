package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public interface ModelPullPushObservable {
    public void attach(ModelPullPushObserver o);
    public void detach(ModelPullPushObserver o);
    public void notifyObservers(Object o);
}
