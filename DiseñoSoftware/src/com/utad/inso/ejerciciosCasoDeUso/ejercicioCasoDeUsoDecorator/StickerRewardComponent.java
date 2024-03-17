package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class StickerRewardComponent implements RewardComponent{

    private String description;

    public StickerRewardComponent(){
        this.description= "Sticker";
    }

    @Override
    public String getDescription() {
       return this.description;
    }
    
}
