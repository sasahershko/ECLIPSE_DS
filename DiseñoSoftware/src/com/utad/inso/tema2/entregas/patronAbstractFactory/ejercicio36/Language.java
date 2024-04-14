package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public enum Language {
    ENGLISH("en"), SPANISH("es");

    private String isoCode;

    private Language(String isoCode){
        this.isoCode=isoCode;
    }

    public String getIsoCode(){
        return this.isoCode;
    }
}
