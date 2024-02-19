package com.utad.inso.tema2.entregas.ejercicioCasoDeUso;

public class Logopeda implements RevisionStrategy{

    @Override
    public void examinarPaciente() {
        System.out.println("Logopeda: niño examinado por el Dr. Fong.");
    }

    @Override
    public void envioFactura() {
        System.out.println("Logopeda: Factura enviada."); 
    }

    @Override
    public void envioExamen() {
        System.out.println("Logopeda: Examen enviado.");
    }
}
