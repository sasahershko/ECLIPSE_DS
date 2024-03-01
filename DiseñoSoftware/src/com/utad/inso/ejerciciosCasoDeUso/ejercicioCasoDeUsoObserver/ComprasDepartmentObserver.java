package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class ComprasDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        System.out.println("[ComprasDepartmentObserver Push] se ha devuelto el libro en mal estado.");    
    }
    
}
