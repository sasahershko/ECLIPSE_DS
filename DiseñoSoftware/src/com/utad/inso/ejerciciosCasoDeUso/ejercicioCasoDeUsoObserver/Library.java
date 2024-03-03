package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class Library{

    private BookAlarm bookAlarm;

    public Library(){
        this(new BookAlarm());
    }

    public Library(BookAlarm bookAlarm){
        this.bookAlarm=bookAlarm;
    }

    public void addObserver(PushObserver o){
        this.bookAlarm.attach(o);
    }
    public void removeObserver(PushObserver o){
        this.bookAlarm.detach(o);
    }

    public void returnBook(Book book){
        if(book.getBookState() == BookState.BAD){
            this.bookAlarm.setBook(book);
            this.bookAlarm.notifyObservers();
        }
    }
}
