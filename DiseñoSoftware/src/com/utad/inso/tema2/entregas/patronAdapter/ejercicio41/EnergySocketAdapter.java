package com.utad.inso.tema2.entregas.patronAdapter.ejercicio41;

public interface EnergySocketAdapter implements EnergySocketService{
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
