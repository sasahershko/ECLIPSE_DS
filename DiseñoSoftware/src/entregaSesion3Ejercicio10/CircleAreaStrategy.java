package entregaSesion3Ejercicio10;
;

public class CircleAreaStrategy implements AreaStrategy{
	//calcular el área círculo
	@Override
	public Double calcularArea(Double medida) {
		return Math.PI*Math.pow(medida, 2);
	}

}
