package com.utad.inso.tema2.entregas.patronDecorator.ejercicio19;

public class TomatoComponentDecorator extends AbstractToppingComponentDecorator{
    public static final Double DEFAULT_PRICE = 1.20;
    public static final String DEFAULT_NAME = "Tomate";

    private Double price;
    private String name;

    public TomatoComponentDecorator(){
      this(TomatoComponentDecorator.DEFAULT_PRICE);  
    }
    public TomatoComponentDecorator(Double price){
        this(price, TomatoComponentDecorator.DEFAULT_NAME);
    }

    @Override
    public String getDescription() {
        return "[TraditionalDough] Name=" + getName() + ", doughType=" + getPizzaDough() + ", unitPrice=" + getPrice();    
    }
    @Override
    public Double getPrice() {
        return getPrice()+DEFAULT_PRICE;    
    }
    @Override
    public Double getUnitPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUnitPrice'");
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
    @Override
    public Integer toppingsNumber() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toppingsNumber'");
    }

    //altera el precio(sumar precio base, precio total de la pizza) - 
}
