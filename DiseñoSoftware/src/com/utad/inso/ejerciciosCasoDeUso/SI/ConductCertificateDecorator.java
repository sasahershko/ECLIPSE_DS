package com.utad.inso.ejerciciosCasoDeUso.SI;

public class ConductCertificateDecorator extends RewardDecorator{

    public ConductCertificateDecorator(RewardComponent decoratedReward){
        super(decoratedReward);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " con premio de buena conducta pañal.";
    }
    
}
