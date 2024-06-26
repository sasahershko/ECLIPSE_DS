package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class Book {
    //Atributos por defecto
    public static final String DEFAULT_BOOK_NAME = "Not specified";
    public static final String DEFAULT_AUTHOR_NAME = "Not specified";

    //Atributos
    protected String bookName;
    protected String authorName;
    protected BookState bookState;

    //Delegación de constructores
    public Book(){
        this(Book.DEFAULT_BOOK_NAME);
    }
    public Book(String bookName){
        this(bookName, Book.DEFAULT_AUTHOR_NAME);
    }
    public Book(String bookName, String authorName){
        this(bookName, authorName, BookState.UNDEFINED);
    }
    public Book(String bookName, String authorName,BookState bookState){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookState=bookState;
    }

    //GETTERS Y SETTERS
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public void setBookState(BookState bookState){
        this.bookState=bookState;
    }
    public BookState getBookState(){
        return this.bookState;
    }

    //ToString del libro
    public String toString(){
        return "Book [title=" + this.bookName + ", author=" + this.authorName +",bookState=" + this.bookState + "]";
    }
}
