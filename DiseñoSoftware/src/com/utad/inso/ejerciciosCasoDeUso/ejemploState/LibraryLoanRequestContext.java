package com.utad.inso.ejerciciosCasoDeUso.ejemploState;
import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryLoanRequestContext implements ModelPullPushObservable{
    
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

    //Lista de observadores
    private ArrayList<ModelPullPushObserver> observers;
    //La estrategia que utilizaremos
    private NotificationStrategy notificationStrategy;

    public void process(){
        //TODO quien debe procesar este método?
        this.currentState.show(this);
    }

    public LibraryLoanRequestContext(LoansLibrary loansLibrary, Book book, LibraryUser libraryUser){
        super();
        this.loansLibrary=loansLibrary;
        this.book=book;
        this.libraryUser=libraryUser;

        observers = new ArrayList<ModelPullPushObserver>();
        notificationStrategy = new PushNotificationStrategy();

        //le ponemos la fecha actual
        this.createdDate = LocalDate.now();
        //dependiendo de si es estudiante o docente, añadirá 10 o 15 días
        this.pickUpDate = createdDate.plusDays(this.libraryUser.getUserType().getLoanDays());

        this.createdLibraryLoanState = new CreatedLibraryLoanState(this);
        this.admittedLibraryLoanState = new AdmittedLibraryLoanState(this);
        this.processedLibraryLoanState = new ProcessedLibraryLoanState(this);
        this.finishedLibraryLoanState = new FinishedLibraryLoanState(this);
        this.declinedLibraryLoanState = new DeclinedLibraryLoanState(this);

        //Lo añadimos como suscriptor
        if(this.libraryUser.getActiveAccount()){
            attach(libraryUser);
        }

        //TODO como indicamos que la reserva comienza en estado Creada??
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


    //MÉTODOS DEL OBSERVABLE
    @Override
    public void attach(ModelPullPushObserver o) {
        this.observers.add(o);
    }

    @Override
    public void detach(ModelPullPushObserver o) {
       this.observers.remove(o);
    }

    @Override
    public void notifyObservers(Object object) {
        for(ModelPullPushObserver o: this.observers){
            notificationStrategy.update(o, this, object);
        }
    }  
}

