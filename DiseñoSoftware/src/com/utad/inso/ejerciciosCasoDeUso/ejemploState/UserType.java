package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public enum UserType {
    STUDENT(15), PROFESSOR(10);
    private final int loanDays;

    private UserType(int loanDays){
        this.loanDays=loanDays;
    }

    public int getLoanDays(){
        return this.loanDays;
    }
}
