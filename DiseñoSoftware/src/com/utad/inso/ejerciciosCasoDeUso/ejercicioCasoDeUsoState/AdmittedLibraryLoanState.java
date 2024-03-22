package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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


        //comprobar que no se ha retrasado más del tiempo establecido para recogerlo (2 días)
        //Utilizo la librería java.time.temporal.ChronoUnit, para poder calcular cuántos días hay entre medias
                                                                                        //pickup date es cuando lo tengan que recoger, y dateReturn cuando lo tengan que devolver?
        long numberOfDays = ChronoUnit.DAYS.between(libraryLoanRequestContext.getCreatedDate(), libraryLoanRequestContext.getPickUpDate());

        if(numberOfDays <= 2){
            System.out.println(libraryLoanRequestContext.getLibraryUser().getName() + " library loan admited on " + libraryLoanRequestContext.getCreatedDate() + 
                                        ", due date to pickup " + libraryLoanRequestContext.getPickUpDate());

            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getProcessedLibraryLoanState());
        }
        else{
            System.out.println("Request declined.");
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
        }
            

    }
    
}
