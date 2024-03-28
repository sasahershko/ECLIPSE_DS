package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class FinishedLibraryLoanState implements LibraryLoanState{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public FinishedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        notification = new LibraryLoanNotification("Done", false);
        this.libraryLoanRequestContext.notifyObservers(notification);
    }
    
}
