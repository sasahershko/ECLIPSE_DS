package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public abstract class SamsungMobile implements Mobile{
    private String language;

    public SamsungMobile(String language){
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
        return "Samsung";
    }
}
