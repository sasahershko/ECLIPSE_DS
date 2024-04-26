package com.utad.inso.tema2.entregas.patronFacade.ejercicio46;

public class Atm {
    private String atmld;

    public Atm(){
        // this.account= account;
    }

    public double readAmount(){
        return 2.0;
    }
    public boolean hasAvailableMoney(double money){
        return true;
    }

    public double extractMoney(double money){
        return money;
    }

    public void printTicket(){
        System.out.println("TICKET");
    }
}
