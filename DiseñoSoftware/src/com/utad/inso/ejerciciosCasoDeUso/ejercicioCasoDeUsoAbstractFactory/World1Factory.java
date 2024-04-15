package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World1Factory implements EnemyAbstractFactory{
    public static final String DEFAULT_NAME = "WORLD 1";
    private String worldName;

    public World1Factory(){
        this.worldName = World1Factory.DEFAULT_NAME;
    }

    @Override
    public Daemon createDaemon() {
        return new World1Daemon();
    }

    @Override
    public Witch createWitch() {
        return new World1Witch();
    }

    @Override
    public Enemy createRandomEnemy() {
        if (Math.random() < 0.5) {
            return createDaemon();
        } else {
            return createWitch();
        }
    }

    @Override
    public String getWorldName(){
        return this.worldName;
    }
}
