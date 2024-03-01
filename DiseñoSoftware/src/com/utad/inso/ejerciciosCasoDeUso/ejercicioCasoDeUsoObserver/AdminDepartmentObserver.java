package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class AdminDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        System.out.println("[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado.");
    }
    
}
