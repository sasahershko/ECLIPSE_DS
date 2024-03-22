package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio29;
import com.utad.inso.tema2.entregas.patronSingleton.Ejercicio27.QuickSoup;

public class LunchSoupOnDemandTest {
    public static void main(String[] args) {
        QuickSoup.makeSoup().ready();
        SingletonSoup.getInstance().ready();
        
    }
}
