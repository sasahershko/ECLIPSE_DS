package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

public class DaemonWorld1 extends CommonEnemy implements Daemon{
    public static final String DEFAULT_COLOR = "red";
    public String color;

    public DaemonWorld1(){
        super("Daemon", World.LEVEL1.getComplexFactor()*20, 1);
        this.color = DaemonWorld2.DEFAULT_COLOR;
    } 

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPower() {
        return this.power;
    }

    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String getColor() {
       return this.color;
    }
    
    public String toString(){
        return "DaemonWorld1 [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", color=" + this.color+ "]"; 
    }

}
