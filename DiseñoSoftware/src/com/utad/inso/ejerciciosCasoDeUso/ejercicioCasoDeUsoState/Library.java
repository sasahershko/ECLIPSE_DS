package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;
import java.util.ArrayList;

public abstract class Library {

    public Library(){}

    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext);

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext);
}
