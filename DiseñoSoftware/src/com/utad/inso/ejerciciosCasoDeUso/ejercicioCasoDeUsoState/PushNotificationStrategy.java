package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class PushNotificationStrategy implements NotificationStrategy{

    @Override
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object) {
        modelObserver.update(null, object);
    }
    
}
