package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class StickerRewardComponent implements RewardComponent{

    //Añadiremos la descripción de la pegatina, que en este caso será el nombre o alias del bebé
    private String description;

    //Constructor
    public StickerRewardComponent(String description){
        this.description= description;
    }

    //Descripción (nombre o alias, como ya he comentado anteriormente)
    @Override
    public String getDescription() {
       return this.description;
    }
    
}
