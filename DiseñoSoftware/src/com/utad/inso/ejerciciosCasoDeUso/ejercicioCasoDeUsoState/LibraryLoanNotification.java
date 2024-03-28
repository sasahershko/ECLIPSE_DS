package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class LibraryLoanNotification {
    private String message;

    public LibraryLoanNotification(String message){
        this.message=message;
    }

    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
}
