package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio30;
import com.utad.inso.tema2.entregas.patronSingleton.Ejercicio29.SingletonSoup;

public class EnumSingletonTest {
    public static void main(String[] args) {
        SingletonSoup singletonSoup = SingletonSoup.getInstance();
        singletonSoup.ready();
        singletonSoup.ready(EnumSingleton.INSTANCE.getInfo());

        //TODO Escribir un mensaje syso
        //pasando por parámetro la hora de inicio de la clase de los martes
        //utiliza la info del enumerado enumclassDay
        System.out.println("On " + EnumClassDay.TUESDAY.getDay()+", this class starts at " + EnumClassDay.TUESDAY.getHoraEmpieza() + "hours.");
    }
}
