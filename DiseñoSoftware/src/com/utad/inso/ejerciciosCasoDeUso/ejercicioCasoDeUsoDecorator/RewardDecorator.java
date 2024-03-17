package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public abstract class RewardDecorator implements RewardComponent {
    protected RewardComponent decoratedReward;

    public RewardDecorator(RewardComponent decoratedReward){
        this.decoratedReward=decoratedReward;
    }

    public String getDescription(){
        return this.decoratedReward.getDescription();
    }
}
