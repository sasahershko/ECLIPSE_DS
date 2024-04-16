package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World2Daemon extends AbstractCommonEnemy implements Daemon{
    public static final DaemonColor DEFAULT_COLOR = DaemonColor.GREEN;
    public DaemonColor color;

    public World2Daemon(){
        super("Big daemon", World.LEVEL2.getComplexFactor()*10, 2);
        this.color = World2Daemon.DEFAULT_COLOR;
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
    public DaemonColor getColor() {
       return this.color;
    }
    
    public String toString(){
        return "WORLD 2 -> DaemonWorld2 [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", color=" + this.color+ "]"; 
    }
}
