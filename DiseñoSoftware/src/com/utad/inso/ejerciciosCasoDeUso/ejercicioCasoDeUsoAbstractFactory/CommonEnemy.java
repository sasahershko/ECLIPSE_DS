package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public abstract class CommonEnemy {
    public String name;
    public Integer power;
    public Integer lives;

    public CommonEnemy(String name, Integer power, Integer lives){
        this.name = name;
        this.power = power;
        this.lives = lives;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPower(){
        return this.power;
    }

    public Integer getLives(){
        return this.lives;
    }
}
