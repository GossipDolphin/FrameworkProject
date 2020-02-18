package model;

import model.Interfaces.ICard;
import java.awt.*;

public class Card implements ICard {

    private int value;
    private int rank;
    private String color;
    private String  image;

    /**
     * @param value number on the card 1 - 14 in latin cards. number on the uno card: 0 if special card
     * @param rank The card type, king, queen etc...
     * @param image image of the card
     * @param color color of the card
     */
    public Card(int value, int rank, String color, String image) {
        this.value = value;
        this.rank = rank;
        this.image = image;
        this.color = color;
    }

    public Card(){
        //empty constructor.
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


