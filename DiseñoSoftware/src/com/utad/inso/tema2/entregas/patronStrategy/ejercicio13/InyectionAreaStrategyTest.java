package com.utad.inso.tema2.entregas.patronStrategy.ejercicio13;

public class InyectionAreaStrategyTest {
    public static void main(String[] args) {
        //LISTA DE FORMAS GEOMÉTRICAS 
        //10 cuadrados(radio): 1-10cms), 10 círculos(lado: 1-10cms) - utilizando InyectionAreaStrategyContext

        //1. IMPRIMIR POR CONSOLA syso(Listado en orden ascendente:)
        //2. ORDENAR LISTA DESCENDENTE (método sort)
        //3. IMPRIMIR LISTA (método print)
        //4. syso(Listado en orden descendente)
        //5. ORDENAR LISTA ORDEN ASCENDENTE (sort)
        //6. IMPRIMIR LISTA (print)

        InyectionContextAreaStrategy inyectionContextAreaStrategy = new InyectionContextAreaStrategy();

        for(int i = 0; i<10; i++) {
            inyectionContextAreaStrategy.getGeometricAreaList().add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0,10)));
            inyectionContextAreaStrategy.getGeometricAreaList().add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0,10)));
        }

        System.out.println("Lista en orden ascendente: ");
        inyectionContextAreaStrategy.sort(new AscendingAreaComparator());
        inyectionContextAreaStrategy.print();

        System.out.println("Lista en orden descendente: ");
        inyectionContextAreaStrategy.sort(new DescendingAreaComparator());
        inyectionContextAreaStrategy.print();

    }
}
