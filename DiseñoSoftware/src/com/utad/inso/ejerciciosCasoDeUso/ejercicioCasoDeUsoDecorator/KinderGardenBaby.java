package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class KinderGardenBaby extends Baby{

    public RewardComponent rewardComponent;

    public KinderGardenBaby(String name, String nickName, Integer age){
        super(name, nickName, age);
        //TODOS LOS NIÑOS CONSIGUEN UNA PEGATINA
        this.rewardComponent = new StickerRewardComponent();
    }

    public RewardComponent getReward(){
        return this.rewardComponent;
    }

    public void setReward(RewardComponent rewardComponent){
        this.rewardComponent = rewardComponent;
    }

    public String getDescrtiption(){
        return this.rewardComponent.getDescription();
    }
}
