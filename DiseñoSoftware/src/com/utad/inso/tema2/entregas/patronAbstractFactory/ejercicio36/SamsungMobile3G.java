package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio36;

public class SamsungMobile3G {
    private TypeConnectivity typeConnectivity;
 
    public SamsungMobile3G(String language){
        super(language);
        this.typeConnectivity = TypeConnectivity.T3G;
    }
}
