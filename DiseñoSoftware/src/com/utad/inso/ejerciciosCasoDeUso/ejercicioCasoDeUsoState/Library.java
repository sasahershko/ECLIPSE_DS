package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public abstract class Library {

    public Library(){}

    public abstract void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext);
    public abstract void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext);
}
