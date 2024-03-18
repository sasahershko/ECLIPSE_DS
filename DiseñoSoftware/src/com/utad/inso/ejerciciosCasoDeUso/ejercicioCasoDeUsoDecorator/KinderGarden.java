package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;
import java.util.ArrayList;

public class KinderGarden {

    //La lista de bebés que almacenaremos
    private ArrayList<KinderGardenBaby> babies;

    //Delegación de constructores
    public KinderGarden(){
        this(new ArrayList<KinderGardenBaby>());
    }
    public KinderGarden(ArrayList<KinderGardenBaby> babies){
        this.babies=babies;
    }

    //Aquí pasaremos lista entre todos los bebés que hay, y si alguno tiene alguna recompensa, se imprimirá por pantalla
    public void checkBabies(){
      System.out.println("====Pasamos lista=============");  
      //Recorremos todos los bebés del Array
        for(KinderGardenBaby baby : this.babies){
            //Imprimimos información del bebé (recompensas ganadas)
            System.out.println(baby.getDescription());
        }
    }

    //Getter del Array de bebés
    public ArrayList<KinderGardenBaby> getBabies(){
        return this.babies;
    }
    //Para añadir los bebés a la lista
    public void addBaby(KinderGardenBaby baby){
        this.babies.add(baby);
    }
}
