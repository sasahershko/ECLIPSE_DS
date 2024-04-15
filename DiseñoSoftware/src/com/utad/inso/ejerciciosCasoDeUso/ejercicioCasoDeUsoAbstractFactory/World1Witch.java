package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoAbstractFactory;

public class World1Witch extends CommonEnemy implements Witch{
    public static final String DEFAULT_MAGIC_POWER = "Magic Wand";
    public String magicPower;

    public World1Witch(){
        super("Witch", World.LEVEL1.getComplexFactor()*15, 2);
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
        return "WORLD 2 -> World1Witch [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", magicPower=" + this.magicPower + "]"; 
    }
}
