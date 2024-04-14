package com.utad.inso.tema2.entregas.patronAbstractFactory.ejercicio37;

public class World2Witch extends CommonEnemy implements Witch{
    public static final String DEFAULT_MAGIC_POWER = "Magic wand and magic broom";
    public String magicPower;

    public World2Witch(){
        super("Big witch", World.LEVEL2.getComplexFactor()*20, 4);
        this.magicPower = World1Witch.DEFAULT_MAGIC_POWER;
    } 

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPower() {
        return this.power;
    }

    @Override
    public Integer getLives() {
        return this.lives;
    }

    @Override
    public String getMagicPower() {
        return this.magicPower;
    }
    
    public String toString(){
        return "World2Witch [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", magicPower=" + this.magicPower+ "]"; 
    }
}
