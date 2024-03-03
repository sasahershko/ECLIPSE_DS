package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;

public class AdminDepartmentObserver implements PushObserver{

    @Override
    public void update(Object o) {
        if(o!=null){
            System.out.println("[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado.\n" + ((Book)o));
        }
        else{
            System.out.println("[AdminDepartmentObserver Pull] se ha devuelto el libro en mal estado.");
        }  
    }
}
