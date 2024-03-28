package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class CreatedLibraryLoanState implements LibraryLoanState{
    private LibraryLoanRequestContext libraryLoanRequestContext;
    //Para saber el mensaje que mandaremos y si es para devolver el libro
    private LibraryLoanNotification notification;

    public CreatedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        String message;

        //No especifica que es lo que tiene que ocurrir para que se rechace, asi que en mi modelo
        //lo rechazaremos si no se específica alguno de los campos pedidos
        if(libraryLoanRequestContext.getLibraryUser().getActiveAccount() == true){
            message = libraryLoanRequestContext.getLibraryUser().getName() + ", library loan admited on " + libraryLoanRequestContext.getCreatedDate() + 
                        ", due date to pickup " + libraryLoanRequestContext.getCreatedDate().plusDays(2);

            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getAdmittedLibraryLoanState());
        }
        else{
            message = "Requiest declined.";
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
            this.libraryLoanRequestContext.notifyObservers(message);
        }

        notification= new LibraryLoanNotification(message, false);
        this.libraryLoanRequestContext.notifyObservers(notification);
    }


}
