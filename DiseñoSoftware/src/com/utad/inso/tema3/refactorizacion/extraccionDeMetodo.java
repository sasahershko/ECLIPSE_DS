package com.utad.inso.tema3.refactorizacion;



public class extraccionDeMetodo {
    
    public void method(){
        int a = 1;
        int b = 2;
        int c = calculate(a, b);
        int d = calculate(a, c);
    }
    
    private int calculate(int a, int b) {
        return a + b;
    }
}
