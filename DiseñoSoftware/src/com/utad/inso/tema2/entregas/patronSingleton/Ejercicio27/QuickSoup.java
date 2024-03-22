package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio27;

public class QuickSoup {

    private static QuickSoup quickSoup;

    private QuickSoup(){}
    
    public static QuickSoup makeSoup(){
        if(quickSoup==null){
            quickSoup = new QuickSoup();
        }
        else{
            System.out.println("El objeto ya está creado.");
        }

        return quickSoup;
    }

    public void ready(){
        System.out.println("QuickSoup is ready.");
    }
}
