package com.utad.inso.tema2.entregas.patronFactory.ejercicio34;

public class Iphone implements Mobile{
    public static String DEFAULT_BRAND = "Iphone";
    private String brand;
    
    public Iphone(){
        this.brand = Iphone.DEFAULT_BRAND;
    }

    @Override
    public String getBrand(){
        return this.brand;
    }
}
