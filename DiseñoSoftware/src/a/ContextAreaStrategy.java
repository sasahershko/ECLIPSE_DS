package a;

public class ContextAreaStrategy {

	private AreaStrategy areaStrategy;

	public AreaStrategy getAreaStrategy() {
		return areaStrategy;
	}

	public void setAreaStrategy(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
	
	public ContextAreaStrategy() {
		this.areaStrategy = new SquareAreaStrategy();
	}
	
	public ContextAreaStrategy(AreaStrategy areaStrategy) {
		this.areaStrategy = areaStrategy;
	}
	
	public void calcularArea(double numero) {
		areaStrategy.calcularArea(numero);
	}
	
}
