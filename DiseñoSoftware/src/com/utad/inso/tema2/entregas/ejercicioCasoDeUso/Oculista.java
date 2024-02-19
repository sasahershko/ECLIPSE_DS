package com.utad.inso.tema2.entregas.ejercicioCasoDeUso;

public class Oculista implements RevisionStrategy{

    @Override
    public void examinarPaciente() {
        System.out.println("Oculista: niño examinado por el Dr. Wang.");
    }

    @Override
    public void envioFactura() {
        System.out.println("Oculista: Factura enviada."); 
    }

    @Override
    public void envioExamen() {
        System.out.println("Oculista: Examen enviado.");
    }
}
