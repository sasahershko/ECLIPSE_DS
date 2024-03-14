package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;
import java.util.ArrayList;

public class KinderGarden {
    public static final ArrayList<KinderGardenBaby> DEFAULT_BABIES = null;

    private ArrayList<KinderGardenBaby> babies;

    public KinderGarden(){
        this(KinderGarden.DEFAULT_BABIES);
    }
    public KinderGarden(ArrayList<KinderGardenBaby> babies){
        this.babies=babies;
    }

    public void checkBabies(){
      System.out.println("chekeando beibis");  
    }
}
