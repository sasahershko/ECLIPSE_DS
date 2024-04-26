package com.utad.inso.tema2.entregas.patronFacade.ejercicio46;

public class AtmFacade {
    

    private Authentication authentication;
    private Atm atm;

    public AtmFacade(){

        this.authentication = new Authentication();
        this.atm = new Atm();
    }

    public void putPersonalData(){

    }
    public void extractMoney(){
        this.authentication.readCard();
        if(atm.hasAvailableMoney(10)){
            atm.extractMoney(10);
        }
        else{

        }
    }
}
