package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio30;

public enum EnumSingleton {
    INSTANCE("enum singleton data");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public void setInfo(String info){
        this.info=info;
    }

    public String getInfo(){
        return this.info;
    }
}
