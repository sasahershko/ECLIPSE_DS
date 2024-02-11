package a;

public class SquareAreaStrategy implements AreaStrategy{

	public void calcularArea(double numero) {
		System.out.println("Area del cuadrado = " + (Math.pow(numero, 2)));
	}
}
