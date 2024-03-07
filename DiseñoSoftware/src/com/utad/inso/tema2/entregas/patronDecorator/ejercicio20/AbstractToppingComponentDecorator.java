package com.utad.inso.tema2.entregas.patronDecorator.ejercicio20;

public abstract class AbstractToppingComponentDecorator implements PizzaComponentDecorator{
    
    protected PizzaComponent pizzaComponent;
    protected String name;
    protected double unitPrice;
    
    public AbstractToppingComponentDecorator(PizzaComponent pizzaComponent, String name, double unitPrice){
        this.pizzaComponent=pizzaComponent;
        this.name=name;
        this.unitPrice=unitPrice;
    }

    @Override
    public PizzaComponent getComponent() {
        return this.pizzaComponent;
    }
    @Override
    public String getDescription() {
        return this.pizzaComponent.getDescription() + ", con " + this.name + "(" + this.unitPrice + ")";
    }
    @Override
    public Double getPrice() {
        return this.pizzaComponent.getPrice()+this.unitPrice;
    }
    @Override
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Integer toppingsNumber() {
        return this.pizzaComponent.toppingsNumber() + 1;
    }
}
