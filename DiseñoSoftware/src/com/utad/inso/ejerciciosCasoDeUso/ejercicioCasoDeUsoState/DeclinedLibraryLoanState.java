package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class DeclinedLibraryLoanState implements LibraryLoanState{

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        System.out.println("Your request has been disapproved.");
    }
    
}
