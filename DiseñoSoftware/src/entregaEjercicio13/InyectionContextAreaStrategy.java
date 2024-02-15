package entregaEjercicio13;
import java.util.ArrayList;
import java.util.Comparator;

//SIGNATURA : lo que designa la propia clase (primera fila)
                                                    
public class InyectionContextAreaStrategy extends ContextAreaStrategy{ //Especialización de..

    private ArrayList<GeometricArea> geometricAreaList;

    //estrategia y lista de objetos geométricos
    public InyectionContextAreaStrategy(){
        this(ContextAreaStrategy.FORMA_POR_DEFECTO);
    }
    public InyectionContextAreaStrategy(AreaStrategy form){
        this(form, new ArrayList<GeometricArea>());
    }
    public InyectionContextAreaStrategy(AreaStrategy form,  ArrayList<GeometricArea> list){
        super(form);
        this.geometricAreaList = list;
    }

    public static double getRandomDoubleBetweenRange(double min, double max){
        return (Math.random()*(max-min)) + min;
    }

        //PATRÓN ESTRATEGIA
    public void sort(Comparator<GeometricArea> comparator){
        this.geometricAreaList.sort(comparator);
    }

    public void print(){
        for(GeometricArea form : geometricAreaList){
            System.out.println(form);
        }
    }

    public ArrayList<GeometricArea> getGeometricAreaList(){
        return this.geometricAreaList;
    }
}
