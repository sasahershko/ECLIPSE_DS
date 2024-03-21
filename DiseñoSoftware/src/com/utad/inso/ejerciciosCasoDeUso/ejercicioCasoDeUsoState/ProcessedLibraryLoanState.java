package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ProcessedLibraryLoanState implements LibraryLoanState{


    private LibraryLoanRequestContext libraryLoanRequestContext;

    public ProcessedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext){
        this.libraryLoanRequestContext=libraryLoanRequestContext;
    }

    @Override
    public void show(LibraryLoanRequestContext libraryLoanRequestContext) {
        /*Recoger, partiendo de una petición admitida, se comprueba que no se ha retrasado más del tiempo
        establecido para recogerlo (2 días), pasa a estado Cursada, Rechazada en caso contrario. 
        Si se cumplen lascondiciones de recogida, se enviará una notificación al usuario confirmando la recogida 
        del libro y recordandolos días disponibles del préstamo. Los docentes tienen 10 días de préstamo y los alumnos 15
        */
        //comprobar que no se ha retrasado más del tiempo establecido para recogerlo (2 días)
        //Utilizo la librería java.time.temporal.ChronoUnit, para poder calcular cuántos días hay entre medias
        long numberOfDays = ChronoUnit.DAYS.between(libraryLoanRequestContext.getCreatedDate(), libraryLoanRequestContext.getPickUpDate());

        if(numberOfDays <= 2){
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getProcessedLibraryLoanState());
        }
        else{
            this.libraryLoanRequestContext.setCurrentState(libraryLoanRequestContext.getDeclinedLibraryLoanState());
        }
            
        
    
    }
    
}
