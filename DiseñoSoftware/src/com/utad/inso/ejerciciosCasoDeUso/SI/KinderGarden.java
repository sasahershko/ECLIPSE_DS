package com.utad.inso.ejerciciosCasoDeUso.SI;
import java.util.ArrayList;

public class KinderGarden {

    private ArrayList<KinderGardenBaby> babies;

    public KinderGarden(){
        this(new ArrayList<KinderGardenBaby>());
    }
    public KinderGarden(ArrayList<KinderGardenBaby> babies){
        this.babies=babies;
    }

    public void checkBabies(){
      System.out.println("====Pasamos lista=============");  
        for(KinderGardenBaby baby : this.babies){
            System.out.println(baby.getDescription());
        }
    }

    public ArrayList<KinderGardenBaby> getBabies(){
        return this.babies;
    }

    public void addBaby(KinderGardenBaby baby){
        this.babies.add(baby);
    }
}
