package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoStrategy;

public class Logopeda implements RevisionStrategy{

    public void examinarPaciente() {
        System.out.println("Logopeda: niño examinado por el Dr. Fong.");
    }

    public void envioFactura() {
        System.out.println("Logopeda: Factura enviada."); 
    }

    public void envioExamen() {
        System.out.println("Logopeda: Examen enviado.");
    }
}
