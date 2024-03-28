package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class LoansLibrary extends Library{
    public LoansLibrary(){
        super();
    }

    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext){
        //devolución y gestión del préstamo
        if(book.getBookState() == BookState.GOOD){
            LibraryLoanNotification notification = new LibraryLoanNotification(book.toString(), true);
            libraryLoanRequestContext.notifyObservers(notification);
        }
    }

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext){
        //quién debe procesar el préstamo bibliotecario?
        libraryLoanRequestContext.process();
   
    }
}
