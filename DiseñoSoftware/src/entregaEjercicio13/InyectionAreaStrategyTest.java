package entregaEjercicio13;

public class InyectionAreaStrategyTest {
    public static void main(String[] args) {
        //LISTA DE FORMAS GEOMÉTRICAS 
        //10 cuadrados(radio): 1-10cms), 10 círculos(lado: 1-10cms) - utilizando IngectionAreaStrategyContext

        //1. IMPRIMIR POR CONSOLA syso(Listado en orden ascendente:)
        //2. ORDENAR LISTA DESCENDENTE (método sort)
        //3. IMPRIMIR LISTA (método print)
        //4. syso(Listado en orden descendente)
        //5. ORDENAR LISTA ORDEN ASCENDENTE (sort)
        //6. IMPRIMIR LISTA (print)

        InyectionContextAreaStrategy inyectionContextAreaStrategy = new InyectionContextAreaStrategy();

        for(int i = 0; i<10; i++) {

            inyectionContextAreaStrategy.getAreaStrategy().add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0,10)));
            inyectionContextAreaStrategy.getGeometricAreaList().add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0,10)));

        }

        System.out.println("List in ascending order: \n");
        inyectionContextAreaStrategy.sort(new AscendingAreaComparator());
        inyectionContextAreaStrategy.print();

        System.out.println("List in descending order: \n");
        inyectionContextAreaStrategy.sort(new DescendingAreaComparator());
        inyectionContextAreaStrategy.print();

    }
}
