package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class StockDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado.");
    }
    
}
