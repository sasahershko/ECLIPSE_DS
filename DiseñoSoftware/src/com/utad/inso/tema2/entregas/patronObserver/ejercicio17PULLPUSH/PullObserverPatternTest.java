package com.utad.inso.tema2.entregas.patronObserver.ejercicio17PULLPUSH;
import java.util.Observer;

public class PullObserverPatternTest {
    public static void main(String[] args) {
        PullModelObservable model = new PullModelObservable();
        Observer observerRadio = new PullModelObserver("Radio Channel");
        Observer observerTv = new PullModelObserver("TV Channel");
        Observer chatChannel = new PullModelObserver("Chat channel");


        //TODO crear observador "Chat Channel" y añadirlo al modelo observable
        model.addObserver(observerRadio);
        model.addObserver(observerTv);
        model.addObserver(chatChannel);

        model.setWeatherState("It's bright and sunny... Let's play football!!");
        model.setWeatherState("It's raining Heavily!... Let's play GO game!!");

    }
}
