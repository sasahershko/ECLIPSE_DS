package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class Book {
    public static String BOOK_NAME_DEFAULT = "N/A";
    public static String AUTOR_NAME_DEFAULT = "N/A";
    public static BookState DEFAULT_BOOK_STATE = BookState.GOOD;

    private String bookName;
    private String autorName;
    private BookState bookState;
   
    public Book(){
        this(Book.BOOK_NAME_DEFAULT);
    }
    public Book(String bookName){
        this(bookName, Book.AUTOR_NAME_DEFAULT);
    }
    public Book(String bookName, String autorName){
        this(bookName, autorName, Book.DEFAULT_BOOK_STATE);
    }
    public Book(String bookName, String autorName, BookState bookState){
        this.bookName=bookName;
        this.autorName=autorName;
        this.bookState = bookState;
    }
    
    public BookState getBookState(){
        return this.bookState;
    }
    public void setBookState(BookState bookState){
        this.bookState=bookState;
    }

    public void bookInfo(){
        System.out.println("Book [title=" + this.bookName + ", autor=" + this.autorName + ", bookState=" + 
        this.bookState +"]"); 
    }
    public String toString(){
        return "Book [title=" + this.bookName + ", autor=" + this.autorName + ", bookState=" + 
        this.bookState +"]";
    }

}
