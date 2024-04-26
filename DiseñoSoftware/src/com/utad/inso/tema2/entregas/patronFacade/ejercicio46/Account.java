package com.utad.inso.tema2.entregas.patronFacade.ejercicio46;

public class Account {

    private double amount;

    public Account(){

    }

    public double checkAvailableBalance(){
        System.out.println("Chequeando balanece...");
        return 1.0;
    }
    public boolean blockAccount(){
        System.out.println("Cuenta bloqueada.");
        return true;
    }
    public boolean unblockAccount(){
        System.out.println("Cuenta desbloqueada.");
        return true;
    }
    public void extractAmount(double amount){
        this.amount  -= amount;
    }
    public boolean updateAccount(){
        System.out.println("Cuenta actualizada.");
        return true;
    }

    public void errorProcess(){
        System.out.println("to' bien");
    }
}
