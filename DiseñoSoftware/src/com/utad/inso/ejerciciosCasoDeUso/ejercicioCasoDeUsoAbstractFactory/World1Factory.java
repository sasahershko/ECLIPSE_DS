package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World1Factory implements EnemyAbstractFactory{

    @Override
    public Daemon createDaemon() {
        return new DaemonWorld1();
    }

    @Override
    public Witch createWitch() {
        return new World1Witch();
    }
    
}
