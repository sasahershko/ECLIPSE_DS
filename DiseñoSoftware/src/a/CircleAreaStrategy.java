package a;

public class CircleAreaStrategy implements AreaStrategy{

	public void calcularArea(double numero) {
		System.out.println("Area del circulo = " + (2*Math.PI*numero));
	}
	
}
