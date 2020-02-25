package model;

import model.Card;

public class CardBuilder {

    int value;
    int rank;
    String color;
    String image;


    /**
     *
     * @param value Returns the value of a card eg: 1,2,3...13
     * @return
     */
    public CardBuilder value(int value){
        this.value = value;
        return this;
    }

    /**
     *
     * @param rank Returns the Rank of a Card in values.
     * @return
     */
    public CardBuilder rank(int rank){
        this.rank = rank;
        return this;
    }

    /**
     *
     * @param color Returns the color of the card eg. red/black/etc...
     * @return
     */
    public CardBuilder color(String color){
        this.color = color;
        return this;
    }

    /**
     *
     * @param image returns the image string of the card. Eg. /src/Images/French/AceSpades.jpg
     * @return
     */
    public CardBuilder image(String image){
        this.image = image;
        return this;
    }

    /**
     *
     * @return Initialize the build sequence of a card.
     */
    public Card build(){
        Card card = new Card(this);
        validateCardObject(card);
        return card;
    }

    /**
     *
     * @param card Validates all the parameters entered. PS: Need to be implemented inside validateCardObject() method.
     */
    private void validateCardObject(Card card){
        //Validation here
    }


}
