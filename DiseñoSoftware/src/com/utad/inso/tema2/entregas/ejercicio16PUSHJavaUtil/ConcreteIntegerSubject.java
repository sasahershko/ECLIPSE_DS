package com.utad.inso.tema2.entregas.ejercicio16PUSHJavaUtil;
import java.util.ArrayList;
import java.util.Observable;

public class ConcreteIntegerSubject extends Observable{
    public static final Integer DEFAULT_STATE = 0;

    private Integer condition;

    public ConcreteIntegerSubject(){
        this(ConcreteIntegerSubject.DEFAULT_STATE);
    }

    public ConcreteIntegerSubject(Integer condition){
        this.condition=condition;
    }

    public Integer getCondition(){
        return this.condition;
    }

    public void setCondition(Integer condition){
        this.condition=condition;
        setChanged();
        this.notifyObservers(this.condition);
    }
}
