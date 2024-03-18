package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class KinderGardenBaby extends Baby{

    //Creamos la recompensa del bebé
    private RewardComponent rewardComponent;

    //Constructor
    public KinderGardenBaby(String name, String alias, Integer age){
        super(name, alias, age);
        //TODOS LOS NIÑOS CONSIGUEN UNA PEGATINA (la pegatina contiene su nombre)
        //Si existe el Alias, lo que aparecerá en la pegatina es el alias del niño, sino, aparecerá en la pegatina el nombre del niño
        if(alias != null){
            this.rewardComponent = new StickerRewardComponent(super.getAlias());
        }
        else{
            this.rewardComponent = new StickerRewardComponent(super.getName());
        }
    }

    //Getters y Setters
    public RewardComponent getReward(){
        return this.rewardComponent;
    }
    public void setReward(RewardComponent rewardComponent){
        this.rewardComponent = rewardComponent;
    }

    //DESCRIPCIÓN
    public String getDescription(){
        return this.rewardComponent.getDescription();
    }
}
