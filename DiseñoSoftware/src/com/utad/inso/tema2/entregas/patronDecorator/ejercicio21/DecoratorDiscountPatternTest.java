package com.utad.inso.tema2.entregas.patronDecorator.ejercicio21;

import java.text.DecimalFormat;

public class DecoratorDiscountPatternTest {
     public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");

        //Base de la pizza
        PizzaComponent pizza = new RomanDough();
        //añadimos componentes a la pizza
        pizza = new TomatoComponentDecorator(pizza);
        pizza = new BroccoliComponentDecorator(pizza);
        pizza = new HamComponentDecorator(pizza);
        pizza = new RedOnionComponentDecorator(pizza);
        
        System.out.println("PIZZA ANTES DEL DESCUENTO: ");
        System.out.println("Producto: " + pizza.getDescription());
        System.out.println("Precio (€): " + dformat.format(pizza.getPrice()));
        System.out.println("Ingredientes, " + pizza.toppingsNumber());

        //Añadimos descuento
        pizza = new PizzaDiscount(pizza, 0.05);

        System.out.println();
        System.out.println("PIZZA DESPUÉS DEL DESCUENTO (5%): ");
        System.out.println("Producto final: " + pizza.getDescription());
        System.out.println("Precio (€): " + dformat.format(pizza.getPrice()));
        System.out.println("Ingredientes, " + pizza.toppingsNumber());

    }  
}
