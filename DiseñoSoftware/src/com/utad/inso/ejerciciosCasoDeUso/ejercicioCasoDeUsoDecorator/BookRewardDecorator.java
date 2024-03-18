package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class BookRewardDecorator extends RewardDecorator{
    //Creamos el libro para proporcionar la información del decorador junto con el libro que se regala
    private Book book;

    //Constructor con el componente RewardComponent, y el libro que utilizaremos más adelante
    public BookRewardDecorator(RewardComponent decoratedReward, Book book){
        super(decoratedReward);
        this.book = book;
    }

    @Override
    public String getDescription(){
        //Aquí podemos ver que además de definir la recompensa además proporcionamos la información del libro 
        return super.getDescription() + " Es niño de la semana con libro: " + book.toString();
    }
}
