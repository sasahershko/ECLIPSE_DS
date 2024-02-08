package entregaSesion3;

public class TextEditorContext {

    private TextFormatterStrategy textFormatterStrategy;
    private String nombreMiembro;

    public TextEditorContext(TextFormatterStrategy textFormatterStrategy){
        super();
        this.textFormatterStrategy = textFormatterStrategy;
    }

    public TextFormatterStrategy getTextFormatterStrategy(){
        return this.textFormatterStrategy;
    }
    public void setTextFormatterStrategy(TextFormatterStrategy textFormatterStrategy){
        this.textFormatterStrategy = textFormatterStrategy;
    }

    public void format(String text){
        //Delegación por composición agregación - ????????????????????
        this.textFormatterStrategy.format(text);
    }

}
