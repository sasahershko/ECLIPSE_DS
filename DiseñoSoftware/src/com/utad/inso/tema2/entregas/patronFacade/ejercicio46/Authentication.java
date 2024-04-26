package com.utad.inso.tema2.entregas.patronFacade.ejercicio46;

public class Authentication {

    private Account personalAccount;
    private String key;

    public Authentication(){
        this.personalAccount = new Account();
        this.key = "whatever";
    }

    public boolean readCard(){
        if(checkKey(key)){

        }
        return true;
    }
    public String readKey(){
        return this.key;
    }
    public boolean checkKey(String key){
        return true;
    }
    public Account getPersonalAccount(){
        return this.personalAccount;
    }
    public void errorProcess(){
        System.out.println("");
    }
}
