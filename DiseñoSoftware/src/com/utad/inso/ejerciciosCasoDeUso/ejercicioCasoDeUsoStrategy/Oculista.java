package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoStrategy;

public class Oculista implements RevisionStrategy{

    public void examinarPaciente() {
        System.out.println("Oculista: niño examinado por el Dr. Wang.");
    }

    public void envioFactura() {
        System.out.println("Oculista: Factura enviada."); 
    }

    public void envioExamen() {
        System.out.println("Oculista: Examen enviado.");
    }
}
