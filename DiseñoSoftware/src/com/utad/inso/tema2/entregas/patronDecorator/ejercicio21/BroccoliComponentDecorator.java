package com.utad.inso.tema2.entregas.patronDecorator.ejercicio21;

public class BroccoliComponentDecorator extends AbstractToppingComponentDecorator {
    public static final Double DEFAULT_PRICE = 1.25;
    public static final String DEFAULT_NAME = "Broccoli";

    public BroccoliComponentDecorator(PizzaComponent pizzaComponent){
        this(pizzaComponent, BroccoliComponentDecorator.DEFAULT_NAME);
    }

    public BroccoliComponentDecorator(PizzaComponent pizzaComponent, String name) {
        super(pizzaComponent, name, BroccoliComponentDecorator.DEFAULT_PRICE);
    }
}
