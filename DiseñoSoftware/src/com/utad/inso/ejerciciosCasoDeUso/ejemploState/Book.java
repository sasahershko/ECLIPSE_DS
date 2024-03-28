package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class Book {
    
    public static final String DEFAULT_BOOK_NAME = "Not Specified";
    public static final String DEFAULT_AUTHOR_NAME = "Not Specified";

    private String bookName;
    private String authorName;
    private BookState bookState;

    public Book(){
        this(Book.DEFAULT_BOOK_NAME);
    }
    public Book(String bookName){
        this(bookName, Book.DEFAULT_AUTHOR_NAME);
    }
    public Book(String bookName, String authorName){
        this(bookName, authorName, BookState.UNDEFINED);
    }
    public Book(String bookName, String authorName ,BookState bookState){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookState=bookState;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public void setAuthorName(String authoString){
        this.authorName=authoString;
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

    public String toString(){
        return "Book [title=" + getBookName() + ", author=" + getAuthorName() + ", bookState=" + getBookState() + "]";
    }

}
