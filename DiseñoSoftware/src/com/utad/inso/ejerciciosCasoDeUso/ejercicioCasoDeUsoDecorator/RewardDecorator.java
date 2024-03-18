package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

//Clase abstracta que extenderán los decoradores
public abstract class RewardDecorator implements RewardComponent {
    
    //Creamos la recompensa
    protected RewardComponent decoratedReward;

    //Constructor
    public RewardDecorator(RewardComponent decoratedReward){
        this.decoratedReward=decoratedReward;
    }

    //descripción de la recompensa
    @Override
    public String getDescription(){
        return this.decoratedReward.getDescription();
    }
}
