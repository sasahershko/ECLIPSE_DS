package com.utad.inso.ejerciciosCasoDeUso.SI;

public class Baby {
    //nombre, apodo edad
    public static final String DEFAULT_NAME = "Not specified";
    public static final String DEFAULT_ALIAS = "Not specified";
    public static final Integer DEFAULT_AGE = 0;

    private String name;
    private String alias;
    private Integer age;

    public Baby(){
        this(Baby.DEFAULT_NAME);
    }
    public Baby(String name){
        this(name, Baby.DEFAULT_ALIAS);
    }
    public Baby(String name, String alias){
        this(name, alias, Baby.DEFAULT_AGE);
    }
    public Baby(String name, String alias, Integer age){
        super();
        this.name= name;
        this.alias= alias;
        this.age = age;
    }

    //SETTERS Y GETTERS
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public String getAlias(){
        return this.alias;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return this.age;
    }

}
