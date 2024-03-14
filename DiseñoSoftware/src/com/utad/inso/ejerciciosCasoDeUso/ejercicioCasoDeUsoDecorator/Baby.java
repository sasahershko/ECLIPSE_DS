package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class Baby {
    //nombre, apodo edad
    public static final String DEFAULT_NAME = "Not specified.";
    public static final String DEFAULT_NICKNAME = "Not specified.";
    public static final Integer DEFAULT_AGE = 0;

    private String name;
    private String nickName;
    private Integer age;

    public Baby(){
        this(Baby.DEFAULT_NAME);
    }
    public Baby(String name){
        this(name, Baby.DEFAULT_NICKNAME);
    }
    public Baby(String name, String nickName){
        this(name, nickName, Baby.DEFAULT_AGE);
    }
    public Baby(String name, String nickName, Integer age){
        super();
        this.name= name;
        this.nickName= nickName;
        this.age = age;
    }

    //SETTERS Y GETTERS
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setNickName(String nickName){
        this.nickName=nickName;
    }
    public String getNickName(){
        return this.nickName;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return this.age;
    }

}
