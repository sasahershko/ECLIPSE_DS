package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class CreatedLibraryLoanState implements LibraryLoanState{
    private LibraryLoanRequestContext libraryLoanRequestContext;

    public CreatedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {

        //No especifica que es lo que tiene que ocurrir para que se rechace, asi que en mi modelo
        //lo rechazaremos si no se específica alguno de los campos pedidos
        if(libraryLoanRequestContext.getLibraryUser().getActiveAccount() == true){
            System.out.println("CREATED. You have two days to pick up the book.");
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getAdmittedLibraryLoanState());
        }
        else{
            System.out.println("Request Declined.");
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
        }
    }


}
