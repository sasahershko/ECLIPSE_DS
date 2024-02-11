package entregaSesion3Ejercicio10;

public class SquareAreaStrategy implements AreaStrategy{
	//calcular el área cuadrado
	@Override
	public Double calcularArea(Double medida) {
		return medida*medida;
	}

}
