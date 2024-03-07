package com.utad.inso.tema2.entregas.patronDecorator.ejercicio20;

public class RedOnionComponentDecorator extends AbstractToppingComponentDecorator{
    public static final Double DEFAULT_PRICE = 0.8;
    public static final String DEFAULT_NAME = "Ham";

    public RedOnionComponentDecorator(PizzaComponent pizzaComponent){
        this(pizzaComponent, RedOnionComponentDecorator.DEFAULT_NAME);
    }

    public RedOnionComponentDecorator(PizzaComponent pizzaComponent, String name) {
        super(pizzaComponent, name, RedOnionComponentDecorator.DEFAULT_PRICE);
    }
}
