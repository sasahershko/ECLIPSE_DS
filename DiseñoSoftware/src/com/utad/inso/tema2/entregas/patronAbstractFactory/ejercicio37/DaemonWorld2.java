package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

public class DaemonWorld2 extends CommonEnemy implements Daemon{
    public static final String DEFAULT_COLOR = "green";
    public String color;

    public DaemonWorld2(){
        super("Big daemon", World.LEVEL2.getComplexFactor()*20, 2);
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
        return "DaemonWorld2 [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", color=" + this.color+ "]"; 
    }
}
