package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class StockDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        //Si el objeto pasado es nulo, realizaremos el método Push
        if(o!=null){
            System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado.\n"+ ((Book)o));
        }
        else{
            //De lo contrario el método Pull
            System.out.println("[StockDepartmentObserver Pull] se ha devuelto el libro en mal estado.");
        }
    }
    
}
