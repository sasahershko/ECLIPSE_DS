package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class DeclinedLibraryLoanState implements LibraryLoanState{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public DeclinedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }


    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        String message = "Your request has been disapproved.";
        notification = new LibraryLoanNotification(message, false);
        //Notificamos a los suscriptores
        this.libraryLoanRequestContext.notifyObservers(notification);
    }
    
}
