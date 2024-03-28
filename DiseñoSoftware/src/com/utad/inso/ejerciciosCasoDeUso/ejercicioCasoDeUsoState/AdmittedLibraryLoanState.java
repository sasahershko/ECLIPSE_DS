package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;
import java.time.temporal.ChronoUnit;

public class AdmittedLibraryLoanState implements LibraryLoanStateTransition {

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public AdmittedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void process(LibraryLoanRequestContext libraryLoanRequestContext) {
        //comprobar que no se ha retrasado más del tiempo establecido para recogerlo (2 días)
        //Utilizo la librería java.time.temporal.ChronoUnit, para poder calcular cuántos días hay entre medias
                                                                                        //pickup date es cuando lo tengan que recoger, y dateReturn cuando lo tengan que devolver?
        long numberOfDays = ChronoUnit.DAYS.between(libraryLoanRequestContext.getCreatedDate(), libraryLoanRequestContext.getCreatedDate().plusDays(2));

        if(numberOfDays <= 2){
            pickUpLibraryLoanState(libraryLoanRequestContext);
        }
        else{
            declineLibraryLoanState(libraryLoanRequestContext);
        }  

    }

    @Override
    public void admitLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The request is already admitted."); 
    }

    @Override
    public void pickUpLibraryLoanState(LibraryLoanRequestContext context) {
        String message = libraryLoanRequestContext.getLibraryUser().getName() + ", library loan pick up on " + libraryLoanRequestContext.getCreatedDate() + 
                 ", due date to return " + libraryLoanRequestContext.getPickUpDate() + " days (" + libraryLoanRequestContext.getLibraryUser().getUserType().getLoanDays() + ")";

        //Creamos notificación
        notification = new LibraryLoanNotification(message);
        //Notificamos a los suscriptores
        this.libraryLoanRequestContext.notifyObservers(notification);      
        //Cambiamos el estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getProcessedLibraryLoanState());
    }

    @Override
    public void returnLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println( "There is nothing to return.");
    }

    @Override
    public void declineLibraryLoanState(LibraryLoanRequestContext context) {
        String message = "Request declined.";
        notification = new LibraryLoanNotification(message);

        //Notificamos
        this.libraryLoanRequestContext.notifyObservers(notification);
        //Cambiamos estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
    }


}
