package com.utad.inso.tema2.entregas.patronFactory.ejercicio33;

public class MobileClientTest {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        Mobile phone = mobileFactory.createMobile("Iphone");

        System.out.println(phone.getBrand());
    }
    
}
