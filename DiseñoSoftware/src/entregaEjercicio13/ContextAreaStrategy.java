package entregaEjercicio13;

public class ContextAreaStrategy {
    public static final AreaStrategy FORMA_POR_DEFECTO = new SquareAreaStrategy();

    private AreaStrategy areaStrategy;

    public ContextAreaStrategy(){
        this(ContextAreaStrategy.FORMA_POR_DEFECTO);
    }

    public ContextAreaStrategy(AreaStrategy areaStrategy){
        this.areaStrategy = areaStrategy;
    }

    public Double CalculaArea(Double num){
        return this.areaStrategy.CalculaArea(num);
    }

    //GETTERS Y SETTERS
    public void setAreaStrategy(AreaStrategy areaStrategy){
        this.areaStrategy = areaStrategy;
    }
    public AreaStrategy getAreaStrategy(){
        return this.areaStrategy;
    }
}
