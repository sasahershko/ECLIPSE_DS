package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoObserver;
import java.util.Observable;
import java.util.Observer;

public class AdminDepartmentObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[AdminDepartmentObserver Pull] se ha devuelto el libro en mal estado.");
        System.out.println("[AdminDepartmentObserver Push] " + arg);
    }   
}

