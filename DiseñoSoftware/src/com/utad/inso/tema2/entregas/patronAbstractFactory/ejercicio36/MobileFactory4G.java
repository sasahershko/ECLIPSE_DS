package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class MobileFactory4G implements AbstractMobileFactory{

    @Override
    public Mobile createIphone() {
       return new Iphone("es");
    }

    @Override
    public Mobile createSamsung() {
        return new Samsung("es");
    }
    
}
