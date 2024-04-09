package com.utad.inso.tema2.entregas.patronFactory.ejercicio35;

public class IphoneMobile implements Mobile{
    public static String DEFAULT_LANGUAGE;

    private String brand;
    private String language;

    public IphoneMobile(String brand){
        this.brand = brand;
        this.language = IphoneMobile.DEFAULT_LANGUAGE;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }
    
}
