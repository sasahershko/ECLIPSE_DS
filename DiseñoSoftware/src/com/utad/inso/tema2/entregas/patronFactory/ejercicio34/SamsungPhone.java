package com.utad.inso.tema2.entregas.patronFactory.ejercicio34;


public class SamsungPhone implements Mobile{

    public static String DEFAULT_BRAND = "Samsung";

    private String brand;

    public SamsungPhone(){
        this.brand=SamsungPhone.DEFAULT_BRAND;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
    
}
