package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        BookAlarm bookAlarm = new BookAlarm();
        Library library = new Library(bookAlarm);
        
        //Instancia los departamentos Stock, Admin y Compras como observadores
        PushObserver stockDepartmentObserver= new StockDepartmentObserver();
        PushObserver adminDepartmentObserver= new AdminDepartmentObserver();
        PushObserver comprasDepartmentObserver= new ComprasDepartmentObserver();

        //Provoca que los departamentos se suscriban a la biblioteca
        library.addObserver(stockDepartmentObserver);
        library.addObserver(adminDepartmentObserver);
        library.addObserver(comprasDepartmentObserver);

        Book bookBad = new Book("Programar sin patrones", "desconocido", BookState.BAD);
        Book bookGood = new Book("Gang of four Design patterns","Erich Gamma, Richard Helm", BookState.GOOD);
        
        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        library.returnBook(bookGood);
        library.returnBook(bookBad);

        //Provoca que el departamento de compras borre su suscripción
        library.removeObserver(comprasDepartmentObserver);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH.");
        Book orherBookBad = new Book ("Programar sin pensar", "desconocido", BookState.BAD);
        library.returnBook(orherBookBad);
    
    }
}
