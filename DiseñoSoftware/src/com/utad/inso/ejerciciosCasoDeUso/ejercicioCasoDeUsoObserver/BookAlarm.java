package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.Observable;

public class BookAlarm extends Observable{
    public static BookState DEFAULT_BOOK_STATE = BookState.GOOD;

    private BookState bookState;

    public BookAlarm(){
        this(BookAlarm.DEFAULT_BOOK_STATE);
    }
    public BookAlarm(BookState bookState){
        this.bookState = bookState;
    }

    public BookState getBookState(){
        return this.bookState;
    }
    public void setBookState(BookState bookState){
        this.bookState=bookState;
        setChanged();
        this.notifyObservers(this.bookState);
    }
}
