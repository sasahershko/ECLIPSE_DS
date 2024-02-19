package com.utad.inso.tema2.entregas.ejercicioCasoDeUso;

public class Guarderia {
    public static final RevisionStrategy CONTEXTO_POR_DEFECTO = new Logopeda();

    private RevisionStrategy revisionStrategy;

    public Guarderia(){
        this(Guarderia.CONTEXTO_POR_DEFECTO);
    }
    public Guarderia(RevisionStrategy revisionStrategy){
        this.revisionStrategy = revisionStrategy;
    }

    //SETTER Y GETTER
    public void setContextStrategy(RevisionStrategy revisionStrategy){
        this.revisionStrategy = revisionStrategy;
    }
    public RevisionStrategy getRevisionStrategy(){
        return this.revisionStrategy;
    }

    public void examinarPaciente(){
        this.revisionStrategy.examinarPaciente();
    }
    public void envioFactura(){
        this.revisionStrategy.envioFactura();
    }
    public void envioExamen(){
        this.revisionStrategy.envioExamen();
    }
    public void actividadesConjuntas(){
        examinarPaciente();
        envioFactura();
        envioExamen();
    }
}
