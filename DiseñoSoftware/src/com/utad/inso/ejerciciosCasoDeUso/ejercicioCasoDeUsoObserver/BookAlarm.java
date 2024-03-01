package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.ArrayList;

public class BookAlarm implements PushSubject{
    public static final BookState DEFAULT_CONDITION = BookState.GOOD;

    private ArrayList<PushObserver> observers;
    private BookState state;
    //private Book book;

    public BookAlarm(){
        this(BookAlarm.DEFAULT_CONDITION);
    }
    public BookAlarm(BookState state){
        this(state, new ArrayList<PushObserver>());
    }
    public BookAlarm(BookState state, ArrayList<PushObserver> observers){
        this.state=state;
        this.observers=observers;
    }

    public void setSubjectState(BookState state){
        this.state=state;
    }
    public BookState getSubjectState(){
        return this.state;
    }

    public void setObservers(ArrayList<PushObserver> observers){
        this.observers=observers;        
    }
    public ArrayList<PushObserver> getObservers(){
        return this.observers;
    }

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
            o.update(this.state);
        }
    }

}
