package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class DeclinedLibraryLoanState implements LibraryLoanStateTransition{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public DeclinedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void process(LibraryLoanRequestContext libraryLoanRequestContext) {
        declineLibraryLoanState(libraryLoanRequestContext);
    }


    @Override
    public void admitLibraryLoanState(LibraryLoanRequestContext context) {
        //No se puede admitir un préstamo que ya ha sido declinado.
        System.out.println("Cannot admit a declined loan.");
    }

    @Override
    public void pickUpLibraryLoanState(LibraryLoanRequestContext context) {
        //No se puede recoger un préstamo que ha sido declinado
        System.out.println("Cannot pick up a declined loan.");
    }

    @Override
    public void returnLibraryLoanState(LibraryLoanRequestContext context) {
        //No se puede devolver un préstamo que ha sido declinado
       System.out.println("Cannot return a declined loan.");
    }

    @Override
    public void declineLibraryLoanState(LibraryLoanRequestContext context) {
        // ya está declinado, probablemente no haga falta hacer nada más
        String message = "Your request has been declined.";
        notification = new LibraryLoanNotification(message);
        //Notificamos a los suscriptores
        this.libraryLoanRequestContext.notifyObservers(notification);
    }
}
