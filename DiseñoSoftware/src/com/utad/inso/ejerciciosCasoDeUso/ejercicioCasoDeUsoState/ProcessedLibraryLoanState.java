package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class ProcessedLibraryLoanState implements LibraryLoanStateTransition{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public ProcessedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void process(LibraryLoanRequestContext libraryLoanRequestContext) {
        returnLibraryLoanState(libraryLoanRequestContext);
    }

    @Override
    public void admitLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The request is already admitted."); 
    }

    @Override
    public void pickUpLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("Already picked up.");
    }

    @Override
    public void returnLibraryLoanState(LibraryLoanRequestContext context) {
        String message = context.getLibraryUser().getName() + " library loan returned on " + context.getCreatedDate() + ", " + context.getBook().toString();

        notification = new LibraryLoanNotification(message);

        //Notificamos a los usuarios suscritos
        this.libraryLoanRequestContext.notifyObservers(notification);
        //cambiamos de estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getFinishedLibraryLoanState());
    }

    @Override
    public void declineLibraryLoanState(LibraryLoanRequestContext context) {
        //No se puede declinar
    }
    
}
