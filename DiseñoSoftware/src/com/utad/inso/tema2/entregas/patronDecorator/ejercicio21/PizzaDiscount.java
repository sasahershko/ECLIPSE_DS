package com.utad.inso.tema2.entregas.patronDecorator.ejercicio21;

public class PizzaDiscount extends AbstractToppingComponentDecorator{
    public static Double DEFAULT_DISCOUNT = 0.0;

    private Double discount;

    //nombre, precio pizzaComponent

    public PizzaDiscount(PizzaComponent pizzaComponent){
        this(pizzaComponent, PizzaDiscount.DEFAULT_DISCOUNT);
    }
    public PizzaDiscount(PizzaComponent pizzaComponent, Double discount){
        super(pizzaComponent, discount.toString(), discount);
        this.discount=discount;
    }

    public void setDiscount(Double discount){
        this.discount=discount;
    }    
    public Double getDiscount(){
        return this.discount;
    }

    @Override
    public String getDescription(){
        return this.pizzaComponent.getDescription()+ " discount (" + this.discount + ")";
    }

    @Override
    public Double getPrice(){
        return this.pizzaComponent.getPrice()* (1-discount);
    }

    @Override
    public Integer toppingsNumber(){
        return this.pizzaComponent.toppingsNumber();
    }

}
    

