package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World1Daemon extends AbstractCommonEnemy implements Daemon{
    public static final DaemonColor DEFAULT_COLOR = DaemonColor.RED;
    private DaemonColor color;

    public World1Daemon(){
        super("Daemon", World.LEVEL1.getComplexFactor()*10, 1);
        this.color = World1Daemon.DEFAULT_COLOR;
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
        return "WORLD 1 -> DaemonWorld1 [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", color=" + this.color+ "]"; 
    }

}
