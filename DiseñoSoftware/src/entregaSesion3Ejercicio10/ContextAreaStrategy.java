package entregaSesion3Ejercicio10;

public class ContextAreaStrategy {
	private AreaStrategy areaStrategy;
	
	public ContextAreaStrategy() {
		this(new SquareAreaStrategy());
	}
	public ContextAreaStrategy(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
	public void setAreaStrategy(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
	public Double calcularArea(Double medida) {
		return this.areaStrategy.calcularArea(medida);
	}
}
