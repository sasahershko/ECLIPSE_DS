package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class FinishedLibraryLoanState implements LibraryLoanStateTransition{

    private LibraryLoanRequestContext libraryLoanRequestContext;
    private LibraryLoanNotification notification;

    public FinishedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void process(LibraryLoanRequestContext libraryLoanRequestContext) {
        notification = new LibraryLoanNotification("The book has been returned.");
        this.libraryLoanRequestContext.notifyObservers(notification);
    }


    @Override
    public void admitLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The loan cannot be admitted as it is already finished.");
    }

    @Override
    public void pickUpLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The loan cannot be picked up as it is already finished.");
    }

    @Override
    public void returnLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The loan cannot be returned as it is already finished.");
    }

    @Override
    public void declineLibraryLoanState(LibraryLoanRequestContext context) {
        System.out.println("The loan cannot be declined as it is already finished.");
    }
    
}
