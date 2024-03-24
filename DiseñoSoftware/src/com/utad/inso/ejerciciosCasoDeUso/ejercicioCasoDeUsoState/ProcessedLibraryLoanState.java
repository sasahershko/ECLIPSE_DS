package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class ProcessedLibraryLoanState implements LibraryLoanState{


    private LibraryLoanRequestContext libraryLoanRequestContext;

    public ProcessedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getFinishedLibraryLoanState());
    }
    
}
