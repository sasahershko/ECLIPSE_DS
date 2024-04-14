package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

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
