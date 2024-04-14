package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class MobileFactoryManager {
    private static MobileFactoryManager mobileFactoryManager;
    private AbstractMobileFactory abstractMobileFactory;

    private MobileFactoryManager(AbstractMobileFactory abstractMobileFactory){
        this.abstractMobileFactory=abstractMobileFactory;
    }

    public static MobileFactoryManager getInstance(){
        return mobileFactoryManager;
    }

    public AbstractMobileFactory getAbstractMobileFactory(){
        return this.abstractMobileFactory;
    }

    public void setAbstractMobileFactory(AbstractMobileFactory abstractMobileFactory){
        this.abstractMobileFactory = abstractMobileFactory;
    }

    public Mobile createIphone(){
        return this.abstractMobileFactory.createIphone();
    }

    public Mobile createSamsung(){
        return this.abstractMobileFactory.createSamsung();
    }

}
