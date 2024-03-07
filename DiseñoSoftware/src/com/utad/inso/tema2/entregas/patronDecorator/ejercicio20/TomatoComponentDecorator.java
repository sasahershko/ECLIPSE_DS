package com.utad.inso.tema2.entregas.patronDecorator.ejercicio20;

public class TomatoComponentDecorator extends AbstractToppingComponentDecorator{

    public static final Double DEFAULT_PRICE = 1.20;
    public static final String DEFAULT_NAME = "Tomate";

    public TomatoComponentDecorator(PizzaComponent pizzaComponent){
        this(pizzaComponent, TomatoComponentDecorator.DEFAULT_NAME);
    }

    public TomatoComponentDecorator(PizzaComponent pizzaComponent, String name) {
        super(pizzaComponent, name, TomatoComponentDecorator.DEFAULT_PRICE);
    }
}
