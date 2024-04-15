package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World2Factory implements EnemyAbstractFactory{
    public static final String DEFAULT_NAME = "WORLD 2";
    private String worldName;

    public World2Factory(){
        this.worldName = World2Factory.DEFAULT_NAME;
    }

    @Override
    public Daemon createDaemon() {
        return new World2Daemon();
    }

    @Override
    public Witch createWitch() {
        return new World2Witch();
    }
    
    @Override
    public Enemy createRandomEnemy() {
        if (Math.random() < 0.7) {
            return createWitch();
        } else {
            return createDaemon();
        }
    }

    @Override
    public String getWorldName(){
        return this.worldName;
    }
}
