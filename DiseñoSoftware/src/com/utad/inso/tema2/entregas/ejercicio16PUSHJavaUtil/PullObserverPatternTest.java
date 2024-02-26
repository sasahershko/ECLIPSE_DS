package com.utad.inso.tema2.entregas.ejercicio16PUSHJavaUtil;
import java.util.Observer;

import com.utad.inso.tema2.entregas.ejercicio17PULL.PullModelObserver;

public class PullObserverPatternTest {
    public static void main(String[] args) {
        ConcreteIntegerSubject concreteIntegerSubject = new ConcreteIntegerSubject();

        Observer binObserver = new BinaryIntegerObserver(concreteIntegerSubject);
        Observer hexObserver = new HexIntegerObserver(concreteIntegerSubject);
        Observer octObserver = new OctIntegerObserver(concreteIntegerSubject);
        
        concreteIntegerSubject.addObserver(binObserver);
        concreteIntegerSubject.addObserver(hexObserver);
        concreteIntegerSubject.addObserver(octObserver);

        System.out.println("First state value****************");
		System.out.println("state decimal value: 11");
		concreteIntegerSubject.setCondition(11);

		System.out.println("Second state value***************");
		System.out.println("State decimal value: 14");
		concreteIntegerSubject.setCondition(14);
    }
}
