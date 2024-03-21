package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;
import java.time.LocalDate;

public class LibraryLoanRequestContext {
    
    private LibraryLoanState currentState;
    private CreatedLibraryLoanState createdLibraryLoanState;
    private AdmittedLibraryLoanState admittedLibraryLoanState;
    private ProcessedLibraryLoanState processedLibraryLoanState;
    private FinishedLibraryLoanState finishedLibraryLoanState;
    private DeclinedLibraryLoanState declinedLibraryLoanState;  

    private LoansLibrary loansLibrary;
    private Book book;
    private LibraryUser libraryUser;
    private LocalDate createdDate;
    private LocalDate pickUpDate;

    public void process(){
        //TODO quien debe procesar este método?
    }

    public LibraryLoanRequestContext(LoansLibrary loansLibrary, Book book, LibraryUser libraryUser){
        super();
        this.loansLibrary=loansLibrary;
        this.book=book;
        this.libraryUser=libraryUser;

        this.createdLibraryLoanState = new CreatedLibraryLoanState(this);
        this.admittedLibraryLoanState = new AdmittedLibraryLoanState(this);
        this.processedLibraryLoanState = new ProcessedLibraryLoanState(this);
        this.finishedLibraryLoanState = new FinishedLibraryLoanState(this);
        this.declinedLibraryLoanState = new DeclinedLibraryLoanState();

        //TODO como indicamos que la reserva comienza en estado Creada??????
        this.currentState = createdLibraryLoanState;
    }

    public void setLibraryUser(LibraryUser libraryUser){
        this.libraryUser=libraryUser;
    }
   public LibraryUser getLibraryUser(){
        return this.libraryUser;
   }

    public void setLoansLibrary(LoansLibrary loansLibrary){
        this.loansLibrary=loansLibrary;
    }
    public LoansLibrary getLoansLibrary(){
        return this.loansLibrary;
    }   

    public void setCurrentState(LibraryLoanState currentState){
        this.currentState=currentState;
    }
    public LibraryLoanState getCurrentState(){
        return this.currentState;
    }

    public void setBook(Book book){
        this.book=book;
    }
    public Book getBook(){
        return this.book;
    }

    public LocalDate getCreatedDate(){
        return this.createdDate;
    }
    public LocalDate getPickUpDate(){
        return this.pickUpDate;
    }

    public AdmittedLibraryLoanState getAdmittedLibraryLoanState(){
        return this.admittedLibraryLoanState;
    }
    public ProcessedLibraryLoanState getProcessedLibraryLoanState(){
        return this.processedLibraryLoanState;
    }
    public FinishedLibraryLoanState getFinishedLibraryLoanState(){
        return this.finishedLibraryLoanState;
    }
    public DeclinedLibraryLoanState getDeclinedLibraryLoanState(){
        return this.declinedLibraryLoanState;
    }

}

