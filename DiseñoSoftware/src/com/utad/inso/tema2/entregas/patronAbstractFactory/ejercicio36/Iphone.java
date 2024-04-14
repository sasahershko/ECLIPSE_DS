package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public abstract class Iphone implements Mobile{
    private String language;
    private Iphone3G iphone3G;
    private Iphone4G iphone4G;

    public Iphone(String language){
        this.language=language;
    }

    public String getLanguage(){
        return this.language;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    @Override
    public String getBrand() {
        return "Apple";
    }
}
