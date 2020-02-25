package model;

import model.Interfaces.ICard;
import java.awt.*;

public abstract class Card implements ICard {

    private int value;
    private int rank;
    private String color;
    private String  image;
    private Card card;



    public Card(){
        //empty constructor.
    }

    public Card getCard(){
        return card;
    }

    @Override
    public Card show() {
        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void buildColor();
    public abstract void buildRank();
    public abstract void buildValue();
    public abstract void buildImage();








    /**
     * Returns the value of each card in a string format.
     * @return
     */
    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", rank=" + rank +
                ", color='" + color + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}


