package com.utad.inso.tema2.entregas.patronFacade.ejerrcicioExtra;

public class ExtraDecorator implements ElementoPedido{
    
    private ElementoPedido elemento;
    private String descripcion;
    private double precio;

    public ExtraDecorator(ElementoPedido elemento, String descripcion, double precio){
        this.elemento = elemento;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public void agregarElemento(ElementoPedido elemento){

    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}
