package model;

import model.Card;

public class CardBuilder {

    int value;
    int rank;
    String color;
    String image;



    public CardBuilder value(int value){
        this.value = value;
        return this;
    }

    public CardBuilder rank(int rank){
        this.rank = rank;
        return this;
    }
    public CardBuilder color(String color){
        this.color = color;
        return this;
    }
    public CardBuilder image(String image){
        this.image = image;
        return this;
    }

    public Card build(){
        Card card = new Card(this);
        validateCardObject(card);
        return card;
    }
    private void validateCardObject(Card card){
        //Validation here
    }


}
