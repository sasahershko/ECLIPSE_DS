package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class CreatedLibraryLoanState implements LibraryLoanStateTransition{
    private LibraryLoanRequestContext libraryLoanRequestContext;
    //Para saber el mensaje que mandaremos y si es para devolver el libro
    private LibraryLoanNotification notification;

    public CreatedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void process(LibraryLoanRequestContext libraryLoanRequestContext) {
        //Debemos comprobar si la cuenta está activa
        if(libraryLoanRequestContext.getLibraryUser().getActiveAccount() == true){
            admitLibraryLoanState(libraryLoanRequestContext);
        }
        else{
            //Si no lo está rechazaremos la petición
            declineLibraryLoanState(libraryLoanRequestContext);
        }
    }

    @Override
    public void admitLibraryLoanState(LibraryLoanRequestContext context) {
        String message = libraryLoanRequestContext.getLibraryUser().getName() + ", library loan admited on " + libraryLoanRequestContext.getCreatedDate() + 
        ", due date to pickup " + libraryLoanRequestContext.getCreatedDate().plusDays(2);

        //Creamos notificación
        notification = new LibraryLoanNotification(message);
        //Notificamos los observadores
        this.libraryLoanRequestContext.notifyObservers(notification);
        //Cambiamos de estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getAdmittedLibraryLoanState());   
    }

    @Override
    public void pickUpLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("You cannot collect an unadmitted loan.");
    }

    @Override
    public void returnLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("An unadmitted loan cannot be returned.");
    }
    
    @Override
    public void declineLibraryLoanState(LibraryLoanRequestContext context) {
        String message = "Request declined.";
        notification = new LibraryLoanNotification(message);

        //Notificamos a observadores
        this.libraryLoanRequestContext.notifyObservers(notification);
        //Cambiamos el estado
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
    }

}
