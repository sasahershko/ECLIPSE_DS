package com.utad.inso.tema2.entregas.patronTemplate.ejercicio40;

public abstract class DoctorServiceStrategy implements ServiceStrategy{
    public void inspectChildren(){}
    public void sentResultsInspections(){}
    public void sendInvoice(){}

    public void applyServiceStrategy(){
        this.inspectChildren();
        this.sentResultsInspections();
        this.sendInvoice();
    }
}
