package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public interface LibraryLoanStateTransition extends LibraryLoanState {
    void admitLibraryLoanState(LibraryLoanRequestContext context);
    void pickUpLibraryLoanState(LibraryLoanRequestContext context);
    void returnLibraryLoanState(LibraryLoanRequestContext context);
    void declineLibraryLoanState(LibraryLoanRequestContext context);
}

