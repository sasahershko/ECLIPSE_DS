package com.utad.inso.tema2.entregas.patronFactory.ejercicio34;

public class IphoneFactory implements MobileFactory{
    private Mobile mobile;

    public IphoneFactory(){
        this.mobile = new Iphone();
    }

    @Override
    public Mobile createMobile() {
        return this.mobile;
    }
}
