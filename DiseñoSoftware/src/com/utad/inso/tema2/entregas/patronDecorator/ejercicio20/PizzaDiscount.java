package com.utad.inso.tema2.entregas.patronDecorator.ejercicio20;

public class PizzaDiscount extends AbstractToppingComponentDecorator{
    
    public static String DEFAULT_DISCOUNT_NAME = "Default discount";
    public static Double DEFAULT_DISCOUNT = 0.0;

    public PizzaDiscount(PizzaComponent pizzaComponent){
        this(pizzaComponent, PizzaDiscount.DEFAULT_DISCOUNT_NAME);
    }
    public PizzaDiscount(PizzaComponent pizzaComponent, String name){
        super(pizzaComponent, name, PizzaDiscount.DEFAULT_DISCOUNT);
    }
}
