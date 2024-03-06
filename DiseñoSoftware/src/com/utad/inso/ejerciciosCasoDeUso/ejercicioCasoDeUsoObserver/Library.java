package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class Library{

    //Declaramos un atributo de la alarma del libro
    private BookAlarm bookAlarm;

    public Library(){
        //Agregación
        this(new BookAlarm());
    }

    public Library(BookAlarm bookAlarm){
        this.bookAlarm=bookAlarm;
    }

    //Para poder utilizar con mayor facilidad los métodos de BookAlarm, pero dentro de esta clase, definimos un método al método.
    public void addObserver(PushObserver o){
        this.bookAlarm.attach(o);
    }
    public void removeObserver(PushObserver o){
        this.bookAlarm.detach(o);
    }

    //Comprobará el estado del libro
    public void returnBook(Book book){
        if(book.getBookState() == BookState.BAD){
            //Si el libro estuviese mal, indicamos de qué libro estamos tratando
            this.bookAlarm.setBook(book);
            //Y notificamos a los observadores
            this.bookAlarm.notifyObservers();
        }
    }
}
