package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class MobileFactory3G implements AbstractMobileFactory{

    @Override
    public Mobile createIphone() {
       return new Iphone3G(Language.SPANISH);
    }

    @Override
    public Mobile createSamsung() {
        return new SamsungMobile4G(Language.SPANISH);
    }
    
}
