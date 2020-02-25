package model;

public class Card {

    private final int value;
    private final int suit;
    private final String color;
    private final String  image;



        Card(CardBuilder builder) {
        this.value = builder.value;
        this.suit = builder.suit;
        this.color = builder.color;
        this.image = builder.image;

    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
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
        return "Card: " + this.value + "," + this.suit + "," + this.color +","+this.image +".";
    }
}


