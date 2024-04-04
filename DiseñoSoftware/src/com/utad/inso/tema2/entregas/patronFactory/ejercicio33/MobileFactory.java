package com.utad.inso.tema2.entregas.patronFactory.ejercicio33;

public class MobileFactory {
    public Mobile createMobile(String brand){
        if(brand.equals("Iphone")){
            return new Iphone();
        }
        else{
            return new SumsungPhone();
        }

    }
}
