package com.utad.inso.tema2.entregas.patronFacade.ejercicio45;

public class ScheduleServer {
    public void startBooting(){
        System.out.println("Starts booting...");
    }
    public void readSystemConfigFile(){
        System.out.println("Reading system config files...");
    }

    public void init(){
        System.out.println("Initializing...");
    }
    public void initializeContext(){
        System.out.println("Initializing context...");
    }
    public void initializeListeners(){
        System.out.println("Initializing listeners...");
    }
    public void createSytemObjects(){
        System.out.println("Creating system objects...");
    }
    public void releaseProcesses(){
        System.out.println("Releasing...");
    }
    public void destroy(){
        System.out.println("Destroying...");
    }
    public void destroySystemObjects(){
        System.out.println("Destroying Listeners...");
    }
    public void destroyListeners(){
        System.out.println("Destroying listeners...");
    }
    public void destroyContext(){
        System.out.println("Destroying context...");
    }
    public void shutdown(){
        System.out.println("Shutting down...");
    }
}
