package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World2Factory implements EnemyAbstractFactory{

    @Override
    public Daemon createDaemon() {
        return new DaemonWorld2();
    }

    @Override
    public Witch createWitch() {
        return new World2Witch();
    }
    
}
