package com.utad.inso.ejerciciosCasoDeUso.SI;

public class KinderGardenBaby extends Baby{

    public RewardComponent rewardComponent;

    public KinderGardenBaby(String name, String alias, Integer age){
        super(name, alias, age);
        //TODOS LOS NIÑOS CONSIGUEN UNA PEGATINA (la pegatina contiene su nombre)
        if(alias != null){
            this.rewardComponent = new StickerRewardComponent(super.getAlias());
        }
        else{
            this.rewardComponent = new StickerRewardComponent(super.getName());
        }
        
    }

    public RewardComponent getReward(){
        return this.rewardComponent;
    }

    public void setReward(RewardComponent rewardComponent){
        this.rewardComponent = rewardComponent;
    }

    public String getDescription(){
        return this.rewardComponent.getDescription();
    }
}
