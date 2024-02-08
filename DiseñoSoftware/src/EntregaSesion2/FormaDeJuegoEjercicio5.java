package entregaSesion2;

public class FormaDeJuegoEjercicio5 {
	
	public void muestraFigura(){
		System.out.println("Mostrando forma.");
	}
	
	public static void muestraFigura(FormaDeJuegoEjercicio5 forma) {
		forma.muestraFigura();
	}
	
	public static void main(String[] args) {
		PiezaDeJuegoEjercicio5 figura = new PiezaDeJuegoEjercicio5();
		PiezaDamaEjercicio5 piezaDama = new PiezaDamaEjercicio5();
		
		figura.muestraFigura();
		figura.muevePieza();
		
		muestraFigura(figura);
		muestraFigura(piezaDama);
	}
	

}
