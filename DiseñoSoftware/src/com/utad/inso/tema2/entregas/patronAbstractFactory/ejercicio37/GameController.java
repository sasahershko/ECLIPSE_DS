package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

import java.util.Objects;

public class GameController {
    private static GameController gameController;
    private EnemyAbstractFactory enemyAbstractFactory;

    private GameController(EnemyAbstractFactory enemyAbstractFactory){
        this.enemyAbstractFactory=enemyAbstractFactory;
    }

    public static GameController getInstance(){
        if(Objects.isNull(gameController)){
            gameController = new GameController(new World1Factory());
        }
        return gameController;
    }

    public EnemyAbstractFactory getAbstractFactory(){
        return this.enemyAbstractFactory;
    }

    public void setEnemyAbstractFactory(EnemyAbstractFactory enemyAbstractFactory){
        this.enemyAbstractFactory = enemyAbstractFactory;
    }

    public Daemon createDaemon(){
        return this.enemyAbstractFactory.createDaemon();
    }
    public Witch createWitch(){
        return this.enemyAbstractFactory.createWitch();
    }

    public void play(){
        System.out.println("Creamos un demonio en el mundo 1 " + enemyAbstractFactory.createDaemon());
        System.out.println("Creamos una bruja en el mundo 1 " + enemyAbstractFactory.createWitch());

        System.out.println("Cambiamos de mundo");
        setEnemyAbstractFactory(new World2Factory());

        System.out.println("Creamos un demonio en el mundo 2 " + enemyAbstractFactory.createDaemon());
        System.out.println("Creamos una bruja en el mundo 2 " + enemyAbstractFactory.createWitch());
    
        System.out.println("Juego finalizado!!");
    }
}
