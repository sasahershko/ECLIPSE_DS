package com.utad.inso.ejerciciosCasoDeUso.SI;

public class StickerRewardComponent implements RewardComponent{

    private String description;

    public StickerRewardComponent(String description){
        this.description= description;
    }

    @Override
    public String getDescription() {
       return this.description;
    }
    
}
