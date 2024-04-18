package com.utad.inso.tema2.entregas.patronTemplate.ejercicioPatronTemplate_Singleton_AbstractFactory;
import java.util.Objects;

public class GamingComputerFactory {
    private static GamingComputerFactory gamingComputerFactory;

    private GamingComputerFactory(){}

    public static GamingComputerFactory getInstance(){
        if(Objects.isNull(gamingComputerFactory)){
            gamingComputerFactory = new GamingComputerFactory();
        }
        return gamingComputerFactory;
    } 

}
