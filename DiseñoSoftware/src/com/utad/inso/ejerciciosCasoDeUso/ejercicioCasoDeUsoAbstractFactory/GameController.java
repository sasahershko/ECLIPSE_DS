package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

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

    public void play() {
        //empieza el juego en el Mundo 1 y muestra detalles específicos de enemigos
        System.out.println("Game Starts in WORLD 1");
        switchWorld(new World1Factory());
        printInitialEnemies();
    
        //cambio a Mundo 2 y muestra detalles específicos de enemigos
        switchWorld(new World2Factory());
        printInitialEnemies();
    
        //generamos estadísticas para cada mundo
        switchWorld(new World1Factory());
        generateAndPrintStats();
    
        switchWorld(new World2Factory());
        generateAndPrintStats();
    
        //terminamos juego
        System.out.println("Game finished!!");
    }
    
    private void switchWorld(EnemyAbstractFactory factory) {
        System.out.println("==============" + "Switching worlds, moving to " + factory.getWorldName() + "==============");
        setEnemyAbstractFactory(factory);
    }
    
    private void printInitialEnemies() {
        Daemon daemon = this.enemyAbstractFactory.createDaemon();
        Witch witch = this.enemyAbstractFactory.createWitch();
        System.out.println("Created a daemon in " + daemon);
        System.out.println("Created a witch in " + witch);
    }
    
    private void generateAndPrintStats() {
        //creamos lista de enemigos para guardarlos y más adelante poder escoger uno aleatorio
        List<Enemy> enemies = new ArrayList<Enemy>();
        //contadores de enemigos
        int daemonCount = 0;
        int witchCount = 0;

        //crearemos 100 enemigos(dependiendo en qué mundo la proporción será diferente)
        for (int i = 0; i < 100; i++) {
            Enemy enemy = this.enemyAbstractFactory.createRandomEnemy();
            //vamos añadiendo los enemigos a nuestra lista
            enemies.add(enemy);
            if (enemy instanceof Daemon) {
                daemonCount++;
            } else if (enemy instanceof Witch) {
                witchCount++;
            }
        }
        System.out.println("Daemons (" + daemonCount + "), Witches (" + witchCount + ") proportion of Daemons " + ((int) ((double) daemonCount / (daemonCount + witchCount) * 100)) + " % (rounded)");
        //escogemos un enemigo Random de los que hemos creado:
        Random random = new Random();
        //escogemos índice aleatorio
        Enemy randomEnemy = enemies.get(random.nextInt(enemies.size())); 
        System.out.println("Example of a random enemy in " + randomEnemy);
    }
    
}
