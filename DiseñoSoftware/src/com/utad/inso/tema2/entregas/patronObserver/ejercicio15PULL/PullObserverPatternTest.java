package com.utad.inso.tema2.entregas.patronObserver.ejercicio15PULL;

public class PullObserverPatternTest {
    public static void main(String[] args) {
        ConcreteIntegerSubject concreteIntegerSubject = new ConcreteIntegerSubject();

        PullObserver binaryIntegerObserver = new BinaryIntegerObserver(concreteIntegerSubject);
        PullObserver hexIntegerObserver = new HexIntegerObserver(concreteIntegerSubject);
        PullObserver octIntegerObserver = new OctIntegerObserver(concreteIntegerSubject);

        concreteIntegerSubject.attach(binaryIntegerObserver);
        concreteIntegerSubject.attach(hexIntegerObserver);
        concreteIntegerSubject.attach(octIntegerObserver);

        System.out.println("First state value****************");
		System.out.println("state decimal value: 11");
		concreteIntegerSubject.setCondition(11);

		System.out.println("Second state value***************");
		System.out.println("State decimal value: 14");
		concreteIntegerSubject.setCondition(14);
    }
}
