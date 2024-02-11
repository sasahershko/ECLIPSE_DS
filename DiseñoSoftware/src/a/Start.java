package a;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Boolean seguir = true;
		double numero = 0;
		
		AreaStrategy circleAreaStrategy = new CircleAreaStrategy();
		AreaStrategy squareAreaStrategy = new SquareAreaStrategy();
		
		ContextAreaStrategy contextAreaStrategy =  new ContextAreaStrategy();
				
		do {
			teclado = new Scanner(System.in);
			System.out.print("Elige el area a calcular (Cuadrado, Circulo, fin): ");
			
			switch(teclado.next().toLowerCase()) {
			case "cuadrado":
				contextAreaStrategy.setAreaStrategy(squareAreaStrategy);
				System.out.print("Introduce el lado: ");
				try { numero = teclado.nextDouble();
				contextAreaStrategy.calcularArea(numero);
				} 
				catch (Exception e) { System.err.print("Error. Debes introducir un numero.\n\n");}
				System.out.println();
				break;
				
			case "circulo":
				contextAreaStrategy.setAreaStrategy(circleAreaStrategy);
				System.out.print("Introduce el radio: ");
				try { numero = teclado.nextDouble();
				contextAreaStrategy.calcularArea(numero);
				} 
				catch (Exception e) { System.err.print("Error. Debes introducir un numero.\n\n");}
				System.out.println();
				break;
				
			case "fin":
				System.out.println("Adios!");
				seguir = false;
				break;
				
			default:
				System.err.println("Error. Introduce Cuadrado o Circulo\n");
				break;
		}
		}while(seguir);

	}

}
