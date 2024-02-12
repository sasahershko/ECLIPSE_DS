package entregaSesion3Ejercicio10;
import java.util.Scanner;

public class AreaStrategyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean menu = true;
        
        CircleAreaStrategy circleAreaStrategy = new CircleAreaStrategy();
        SquareAreaStrategy squareAreaStrategy = new SquareAreaStrategy();

        ContextAreaStrategy contextAreaStrategy = new ContextAreaStrategy();

        while(menu){
            System.out.print("\nElija el área que desea calcular:\n- Cuadrado\n- Círculo\n- Salir\nEscriba su respuesta: ");

            //Dependiendo de lo que nos introduzcan por teclado
            switch(sc.next().toLowerCase()){

                case "circulo":
                    //Seteamos, en este caso la clase círculo
                    contextAreaStrategy.setAreaStrategy(circleAreaStrategy);

                    System.out.println("Escriba el radio del círculo en cms: ");
                    Double lado = sc.nextDouble();
                    contextAreaStrategy.CalculaArea(lado);
                break;

                case "cuadrado":
                  //Seteamos, en este caso la clase cuadrado
                  contextAreaStrategy.setAreaStrategy(squareAreaStrategy);

                  System.out.println("Escriba el lado del cuadrado en cms: ");
                  Double radio = sc.nextDouble();
                  contextAreaStrategy.CalculaArea(radio);
                break;

                case "salir":
                    System.out.println("Saliendo...");
                    menu = false;
                break;

                default:
                    System.out.println("Por favor, elija una respuesta válida.");
                break;
            }
        }
        
        //Cerramos scanner
        sc.close();
    }
}
