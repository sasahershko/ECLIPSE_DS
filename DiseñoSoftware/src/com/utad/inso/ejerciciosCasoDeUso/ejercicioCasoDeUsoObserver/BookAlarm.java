package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.ArrayList;

public class BookAlarm implements PushSubject {
    public static final BookState DEFAULT_CONDITION = BookState.GOOD;

    private ArrayList<PushObserver> observers; //Esta será la lista de observadores
    private Book book; //El libro que al actualizar, nos brindará toda la información a los suscriptores

    //Constructores
    public BookAlarm(){
        this(new Book(null,null,null));
    }
    public BookAlarm(Book book){
        this(book, new ArrayList<PushObserver>());
    }
    public BookAlarm(Book book, ArrayList<PushObserver> observers){
        this.book=book;
        this.observers=observers;
    }

    //SETTERS y GETTERS
    public void setBook(Book book){
        this.book=book;
    }
    public Book getBook(){
        return this.book;
    }
    public void setObservers(ArrayList<PushObserver> observers){
        this.observers=observers;        
    }
    public ArrayList<PushObserver> getObservers(){
        return this.observers;
    }

    //MÉTODOS OBSERVABLE
    @Override
    public void attach(PushObserver o) {
        this.observers.add(o);
    }

    @Override
    public void detach(PushObserver o) {
       this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(PushObserver o: this.observers){
            //Pasaremos como parámetro el objeto libro para brindarnos la información (Método Push)
            o.update(this.book);
        }
    }

}
