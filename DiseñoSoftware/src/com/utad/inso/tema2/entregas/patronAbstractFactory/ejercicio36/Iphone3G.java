package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class Iphone3G extends Iphone{
    private TypeConnectivity typeConnectivity;

    public Iphone3G(Language language){
        super(language);
        this.typeConnectivity = TypeConnectivity.T3G;
    }
}
