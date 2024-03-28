package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class PushNotificationStrategy implements NotificationStrategy{

    @Override
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object) {
        //del modelObserver que le paso (en este caso el LibraryUser), actualizaremos sus datos
        //por ello pasamos por parámetros el modeloObservable (LibraryRequestContext)
        modelObserver.update(modelObservable, object);
    }
    
}
