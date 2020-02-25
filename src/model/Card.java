package model;

import model.Interfaces.ICard;
import java.awt.*;

public class Card {

    private final int value;
    private final int rank;
    private final String color;
    private final String  image;



        Card(CardBuilder builder) {
        this.value = builder.value;
        this.rank = builder.rank;
        this.color = builder.color;
        this.image = builder.image;

    }

    public int getValue() {
        return value;
    }

    public int getRank() {
        return rank;
    }

    public String getColor() {
        return color;
    }

    public String getImage() {
        return image;
    }


    /**
     * Returns the value of each card in a string format.
     * @return
     */
    @Override
    public String toString() {
        return "Card: " + this.value + "," + this.rank + "," + this.color +","+this.image +".";
    }
}


