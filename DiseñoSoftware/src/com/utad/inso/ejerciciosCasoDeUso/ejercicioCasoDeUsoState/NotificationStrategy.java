package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public interface NotificationStrategy {
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object);
}
