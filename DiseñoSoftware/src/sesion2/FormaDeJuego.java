package sesion2;

public class FormaDeJuego {
	
	public void muestraFigura(){
		System.out.println("Mostrando forma");
	}
	
	public static void muestraFigura(FormaDeJuego forma) {
		forma.muestraFigura();
	}
	
	public static void main(String[] args) {
		PiezaDeJuego figura = new PiezaDeJuego();
		PiezaDama piezaDama = new PiezaDama();
		
		figura.muestraFigura();
		figura.muevePieza();
		
		muestraFigura(figura);
		muestraFigura(piezaDama);
	}
	

}
