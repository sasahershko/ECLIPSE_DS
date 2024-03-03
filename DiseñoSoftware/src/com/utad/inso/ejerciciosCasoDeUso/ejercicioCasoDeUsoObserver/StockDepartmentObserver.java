package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class StockDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        if(o!=null){
            System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado.\n"+ ((Book)o).toString());
        }
        else{
            System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado.");
        }
    }
    
}
