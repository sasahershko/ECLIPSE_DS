package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class AdmittedLibraryLoanState implements LibraryLoanState {

    private LibraryLoanRequestContext libraryLoanRequestContext;

    public AdmittedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        //comprobar que no se ha retrasado más del tiempo establecido para recogerlo (2 días), sino se convierte en cursada
        //si se cumple las condiciones de recogida, se envia una notificacion al usuario confirmando la recogida del libro  y recordando
        //los días disponibles del préstamos
        //DOCENTES = 10 DÍAS, ALUMNOS = 15

        // if(libraryLoanRequestContext.get){

        // }


    }
    
}
