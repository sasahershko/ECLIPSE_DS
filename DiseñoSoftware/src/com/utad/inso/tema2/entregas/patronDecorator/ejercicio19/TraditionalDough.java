package com.utad.inso.tema2.entregas.patronDecorator.ejercicio19;

public class TraditionalDough implements PizzaBaseComponent{
    public static final Double DEFAULT_PRICE = 8.0;
    public static final String DEFAULT_NAME = "Napolitana";

    private Double unitPrice;
    private String name;
    private DoughType doughType;

    public TraditionalDough(){
        this(TraditionalDough.DEFAULT_PRICE);
    }
    public TraditionalDough(Double unitPrice){
        this(unitPrice, TraditionalDough.DEFAULT_NAME);
    }
    public TraditionalDough(Double unitPrice, String name){
        this(unitPrice, name, DoughType.GRUESA);
    }
    public TraditionalDough(Double unitPrice, String name, DoughType doughType){
        super();
        this.unitPrice=unitPrice;
        this.name=name;
        this.doughType=doughType;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setDoughType(DoughType doughType){
        this.doughType=doughType;
    }
    public void setUnitPrice(Double unitPrice){
        this.unitPrice=unitPrice;
    }

    @Override
    public String getDescription() {
        //
        return "[TraditionalDough] Name=" + this.name + ", doughType=" + this.doughType + ", unitPrice=" + this.unitPrice;
    }

    @Override
    public Double getPrice() {
        //AL AÑADIR TOPPINGS SE IRÁ INCREMENTANDO
        return this.unitPrice;  
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
        //AL SER UN COMPONENTE BASE CORRESPONDE CON EL PRECIO BBASE
        return 0;    
    }

    @Override
    public DoughType getPizzaDough() {
       return this.doughType;
    }
    
}
