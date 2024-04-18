package com.utad.inso.tema2.entregas.patronTemplate.ejercicioPatronTemplate_Singleton_AbstractFactory;

public abstract class ComputerBuilder{
    public final void buildComputer(){
        this.addProcessor();
        this.addMemory();
        this.addStorage();
        this.addGraphicsCard();
        this.addPowerSupply();
        this.assembleComputer();
    }

    protected abstract void addProcessor();
    protected abstract void addMemory();
    protected abstract void addStorage();
    protected abstract void addGraphicsCard();
    protected abstract void addPowerSupply();

    protected void assembleComputer(){
        System.out.println("Assembling the computer...");
    }
}
