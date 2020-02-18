package model;

import model.Interfaces.ICard;

import java.awt.*;

public class Card implements ICard {

    private int value;
    private int rank;
    private Image  jpg_Image;

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
        return jpg_Image;
    }

    public void setJpg_Image(Image jpg_Image) {
        this.jpg_Image = jpg_Image;
    }

    public Card(int value, int rank, Image jpg_Image) {
        this.value = value;
        this.rank = rank;
        this.jpg_Image = jpg_Image;
    }

    public Card(){
        //empty constructor.
    }

}


