package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio29;

public class SingletonSoup {
    private static SingletonSoup soupOnDemand = new SingletonSoup();

    private SingletonSoup(){}

    public static SingletonSoup getInstance(){
        return soupOnDemand;
    }

    public void ready(){
        System.out.println("Singleton Soup is ready.");
    }

    public void ready(String info){
        System.out.println("Singleton Soup is ready with "+ info);
    }
}
