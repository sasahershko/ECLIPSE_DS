package com.utad.inso.tema2.entregas.patronSingleton.Ejercicio30;

public enum EnumClassDay {
    MONDAY("Monday",19,21), TUESDAY("Tuesday",19,21), FRIDAY("Friday",15,17);

    private String day;
    private Integer classStarts;
    private Integer classFinishes;

    private EnumClassDay(String day, Integer classStarts, Integer classFinishes){
        this.day = day;
        this.classStarts = classStarts;
        this.classFinishes = classFinishes;
    }


    public void setHoraEmpieza(Integer classStarts){
        this.classStarts=classStarts;
    }
    public Integer getHoraEmpieza(){
        return this.classStarts;
    }

    public void setHoraAcaba(Integer classFinishes){
        this.classFinishes=classFinishes;
    }
    public Integer getHoraAcaba(){
        return this.classFinishes;
    }

    public String getDay(){
        return this.day;
    }

}
