package entregaSesion3Ejercicio10;
;

public class AreaStrategyTest {
	public static void main(String[] args) {
		//cáculo del área del círculo
		AreaStrategy areaStrategy = new CircleAreaStrategy();
		ContextAreaStrategy contexto = new ContextAreaStrategy(areaStrategy);
		System.out.println("El área del círculo de radio 2.5 es " + contexto.calcularArea(2.5).toString());
		
		//cáculo del área del cuadrado
		areaStrategy = new SquareAreaStrategy();
		contexto.setAreaStrategy(areaStrategy);
		System.out.println("El área del cuadrado de radio 2.5 es " + contexto.calcularArea(2.5).toString());
		
	}
}
