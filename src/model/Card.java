package model;

import model.Interfaces.ICard;
import java.awt.*;

public class Card implements ICard {

    private int value;
    private int rank;
    private String color;
    private Image  ImageOfCard;

    /**
     * @param value number on the card 1 - 14 in latin cards. number on the uno card: 0 if special card
     * @param rank The card type, king, queen etc...
     * @param jpg_Image image of the card
     * @param color color of the card
     */
    public Card(int value, int rank, String color, Image jpg_Image) {
        this.value = value;
        this.rank = rank;
        this.ImageOfCard = jpg_Image;
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

    public Image getJpg_Image() {
        return ImageOfCard;
    }

    public void setJpg_Image(Image jpg_Image) {
        this.ImageOfCard = jpg_Image;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


