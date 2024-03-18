package com.utad.inso.ejerciciosCasoDeUso.SI;

public class BookRewardDecorator extends RewardDecorator{

    private Book book;

    public BookRewardDecorator(RewardComponent decoratedReward, Book book){
        super(decoratedReward);
        this.book = book;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " es niño de la semana con libro: " + book.toString();
    }
}
