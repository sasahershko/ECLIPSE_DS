package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class ProcessedLibraryLoanState implements LibraryLoanState{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public ProcessedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        String message = "Finalized.";
        notification = new LibraryLoanNotification(message, false);

        //Notificamos a los usuarios suscritos
        this.libraryLoanRequestContext.notifyObservers(notification);
        //cambiamos de estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getFinishedLibraryLoanState());
    }
    
}
