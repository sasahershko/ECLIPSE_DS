package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public interface NotificationStrategy {
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object);
}
