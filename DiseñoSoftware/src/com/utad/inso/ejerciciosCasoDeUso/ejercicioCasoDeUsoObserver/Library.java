package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.Observable;

public class Library extends BookAlarm{
    //BookAlarm bookAlarm = new BookAlarm();

    public void returnBook(Book book){
        if(book.getBookState() == BookState.BAD){
            //bookAlarm.setBookState(BookState.BAD);
        }
    }
}

//NOTAS
//dañádo - estado de una clase
//AlarmaLibro - el observable  (mirar: cómo lo metemos en el diagrama)
//bookAlarm implementa de pullpushModel...

//basically:
//Si el lector devuelve el libro dañado -> se ven afectadas stock, compras y administración
//Si el libro se vuelve en mal estado -> avisa a objeto BookAlarm
//Clase/Interfaz BookAlarm es sujeto de interés para stock, compras y admin ->OBSERVADORAS DE CLASE BOOKALARM
