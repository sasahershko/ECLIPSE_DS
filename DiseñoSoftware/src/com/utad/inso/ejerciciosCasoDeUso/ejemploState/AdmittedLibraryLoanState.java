package com.utad.inso.ejerciciosCasoDeUso.ejemploState;
import java.time.temporal.ChronoUnit;

public class AdmittedLibraryLoanState implements LibraryLoanState {

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public AdmittedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        //comprobar que no se ha retrasado más del tiempo establecido para recogerlo (2 días)
        //Utilizo la librería java.time.temporal.ChronoUnit, para poder calcular cuántos días hay entre medias
                                                                                        //pickup date es cuando lo tengan que recoger, y dateReturn cuando lo tengan que devolver?
        long numberOfDays = ChronoUnit.DAYS.between(libraryLoanRequestContext.getCreatedDate(), libraryLoanRequestContext.getCreatedDate().plusDays(2));
        //Creamos el mensaje que mandaremos a los suscriptores
        String message;

        if(numberOfDays <= 2){
            message = libraryLoanRequestContext.getLibraryUser().getName() + ", library loan pick up on " + libraryLoanRequestContext.getCreatedDate() + 
                 ", due date to return " + libraryLoanRequestContext.getPickUpDate() + " days (" + libraryLoanRequestContext.getLibraryUser().getUserType().getLoanDays() + ")";

            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getProcessedLibraryLoanState());
        }
        else{
            message = "Request declined.";
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
        }
        
        notification = new LibraryLoanNotification(message, false);
        //Notificamos a los suscriptores
        this.libraryLoanRequestContext.notifyObservers(notification);
    }
    
}
