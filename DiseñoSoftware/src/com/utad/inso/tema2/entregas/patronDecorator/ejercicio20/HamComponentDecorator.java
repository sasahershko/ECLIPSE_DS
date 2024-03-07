package com.utad.inso.tema2.entregas.patronDecorator.ejercicio20;

public class HamComponentDecorator extends AbstractToppingComponentDecorator{
    public static final Double DEFAULT_PRICE = 4.12;
    public static final String DEFAULT_NAME = "Ham";

    public HamComponentDecorator(PizzaComponent pizzaComponent){
        this(pizzaComponent, HamComponentDecorator.DEFAULT_NAME);
    }

    public HamComponentDecorator(PizzaComponent pizzaComponent, String name) {
        super(pizzaComponent, name, HamComponentDecorator.DEFAULT_PRICE);
    }
}
