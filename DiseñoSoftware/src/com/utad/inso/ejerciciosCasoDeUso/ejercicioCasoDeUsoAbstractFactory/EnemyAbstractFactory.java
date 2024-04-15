package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public interface EnemyAbstractFactory {
    public Daemon createDaemon();
    public Witch createWitch();
    public Enemy createRandomEnemy();
    public String getWorldName();
}
