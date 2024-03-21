package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class FinishedLibraryLoanState implements LibraryLoanState{

    private LibraryLoanRequestContext libraryLoanRequestContext;

    public FinishedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
    
}
