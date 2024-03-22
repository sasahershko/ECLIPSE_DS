package com.utad.inso.tema2.entregas.patronSingleton.SistemaDeProcesamientosDePagos;

public class PaymentManager {
    private static PaymentManager paymentManager;

    private PaymentManager(){}

    private static PaymentManager getPaymentManager(){
        if(paymentManager==null){
            paymentManager= new PaymentManager();
        }
        else{
            System.out.println("Objeto ya creado");
        }
        return paymentManager;
    }
}

