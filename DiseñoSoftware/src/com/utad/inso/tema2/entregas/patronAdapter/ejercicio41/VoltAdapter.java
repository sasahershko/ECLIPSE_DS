package com.utad.inso.tema2.entregas.patronAdapter.ejercicio41;

public class VoltAdapter extends EnergySocket implements EnergySocketAdapter {

    public VoltAdapter(Volt volt){
        super(volt);
    }

    @Override
    public Volt get120Volt() {
        return super.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return super.getVolt();
    }

    @Override
    public Volt get3Volt() {
        return super.getVolt();
    }

    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
