package com.utad.inso.tema2.entregas.patronFactory.ejercicio34;

public class MobileFactoryManager {
    private static MobileFactoryManager mobileFactoryManager = new MobileFactoryManager();
    private MobileFactory mobileFactory;

    private MobileFactoryManager(){
        this(new IphoneFactory());
    }

    private MobileFactoryManager(MobileFactory mobileFactory){
        this.mobileFactory = mobileFactory;
    }

    public static MobileFactoryManager getInstance(){
        return mobileFactoryManager;
    }

    public MobileFactory getMobileFactory(){
        return this.mobileFactory;
    }

    public void setMobileFactory(MobileFactory mobileFactory){
        this.mobileFactory = mobileFactory;
    }

    public Mobile creatMobile(){
        return mobileFactory.createMobile();
    }
}
