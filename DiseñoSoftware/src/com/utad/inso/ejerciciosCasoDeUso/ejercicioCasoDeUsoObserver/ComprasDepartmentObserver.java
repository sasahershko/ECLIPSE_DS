package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class ComprasDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        if(o!=null){
            System.out.println("[ComprasDepartmentObserver Push] se ha devuelto el libro en mal estado.\n" + ((Book)o));    
        }
        else{
            System.out.println("[ComprasDepartmentObserver Pull] se ha devuelto el libro en mal estado.");    
        }
        
    }
}
