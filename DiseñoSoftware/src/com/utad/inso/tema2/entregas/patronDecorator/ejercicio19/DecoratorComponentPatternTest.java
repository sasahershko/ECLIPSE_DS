package com.utad.inso.tema2.entregas.patronDecorator.ejercicio19;

import java.text.DecimalFormat;

public class DecoratorComponentPatternTest {
    public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");

        //Base de la pizza
        PizzaComponent pizza = new TraditionalDough();

        System.out.println("Producto: " + pizza.getDescription());
        System.out.println("Precio (€): " + dformat.format(pizza.getPrice()));
        System.out.println("Ingredientes, " + pizza.toppingsNumber());

        //Cómo se añaden los tomates a la base de pizza
        pizza = new TomatoComponentDecorator(pizza);   

        System.out.println();
        System.out.println("Producto final: " + pizza.getDescription());
        System.out.println("Precio (€): " + dformat.format(pizza.getPrice()));
        System.out.println("Ingredientes, " + pizza.toppingsNumber());

    }   
}
