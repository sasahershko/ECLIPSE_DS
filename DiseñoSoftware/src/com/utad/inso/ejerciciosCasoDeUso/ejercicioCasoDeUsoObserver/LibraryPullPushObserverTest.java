package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.Observer;

public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();
        
        //TODO Instancia los departamentos Stock, Admin y Compras como observadores
        Observer stockObserver = new StockDepartmentObserver();
        Observer comprasObserver = new ComprasDepartmentObserver();
        Observer adminObserver = new AdminDepartmentObserver();

        //TODO provoca que los departamentos se suscriban a la biblioteca
        library.addObserver(stockObserver);
        library.addObserver(comprasObserver);
        library.addObserver(adminObserver);

        Book bookBad = new Book("Programar sin patrones", "desconocido", BookState.BAD);
        Book bookGood = new Book("Gang of four Design patterns","Erich Gamma, Richard Helm", BookState.GOOD);
        
        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        library.returnBook(bookGood);
        library.returnBook(bookBad);

        //TODO provoca que el departamento de compras borre su suscripción
        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH.");
        //Book orherBookBad = new Book ("Programar sin pensar", "desconocido", BokkState.BAD);
        //library.returnBook(orherBookBad);
    
    }
}
