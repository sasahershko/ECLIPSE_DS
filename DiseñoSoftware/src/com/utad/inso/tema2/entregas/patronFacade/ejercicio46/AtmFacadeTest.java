package com.utad.inso.tema2.entregas.patronFacade.ejercicio46;

public class AtmFacadeTest {
    public static void main(String[] args) {
        AtmFacade cajeroAutomatico = new AtmFacade();

        cajeroAutomatico.putPersonalData();
        cajeroAutomatico.extractMoney();
    }
}
