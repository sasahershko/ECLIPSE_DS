package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World2Witch extends CommonEnemy implements Witch{
    public static final String DEFAULT_MAGIC_POWER = "Magic wand and magic broom";
    public String magicPower;

    public World2Witch(){
        super("Big witch", World.LEVEL2.getComplexFactor()*15, 4);
        this.magicPower = World2Witch.DEFAULT_MAGIC_POWER;
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
        return "WORLD 2 -> World2Witch [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", magicPower=" + this.magicPower+ "]"; 
    }
}
