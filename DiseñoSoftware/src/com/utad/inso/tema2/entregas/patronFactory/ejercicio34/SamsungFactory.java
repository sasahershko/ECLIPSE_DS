package com.utad.inso.tema2.entregas.patronFactory.ejercicio34;

public class SamsungFactory implements MobileFactory{
    private Mobile mobile;

    public SamsungFactory(){
        this.mobile = new Iphone();
    }

    @Override
    public Mobile createMobile() {
        return this.mobile;
    }
}
