package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class LoansLibrary extends Library{
    public LoansLibrary(){
        super();
    }

    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext) {
        if (book.getBookState() == BookState.GOOD) {
            LibraryLoanState currentState = libraryLoanRequestContext.getCurrentState();
            
            //primero quiero ver si es una instancia
            if (currentState instanceof LibraryLoanStateTransition) {
                //quiero comprobar si ha llegado a procesarse, en el momento que esté en modo proceso podremos devolver el libro
                if(currentState == libraryLoanRequestContext.getProcessedLibraryLoanState()){
                    //lo casteo (por ello compruebo si es una instancia de)
                    LibraryLoanStateTransition stateTransition = (LibraryLoanStateTransition) currentState;
                    //devuelvo el libro
                    stateTransition.returnLibraryLoanState(libraryLoanRequestContext);
                }
            } else {
                //manejo del caso en que el estado actual no soporta transiciones
                System.out.println("Current state does not support return operation.");
            }
        } else {
            System.out.println("The book is in a bad condition.");
        }
    }

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext){
        //quién debe procesar el préstamo bibliotecario?:
        libraryLoanRequestContext.process();
    }
}
