package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class ConductCertificateDecorator extends RewardDecorator{

    //Constructor
    public ConductCertificateDecorator(RewardComponent decoratedReward){
        super(decoratedReward);
    }

    //Método donde especificamos su definición
    @Override
    public String getDescription(){
        return super.getDescription() + " con premio de buena conducta pañal.";
    }
    
}
