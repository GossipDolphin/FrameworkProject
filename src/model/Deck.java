package model;

import java.util.ArrayList;

public class Deck {

    public String deckName;
    public ArrayList<Card> Deck;

    /**
     * @param deckName Specifies the name of the Deck
     * @param deck     Arraylist of type Cards which are contained in the deck.
     */
    public Deck(String deckName, ArrayList<Card> deck) {
        this.deckName = deckName;
        Deck = deck;
    }

    public Deck() {
        // Empty constructor
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public ArrayList<Card> getDeck() {
        return Deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        Deck = deck;
    }

    /**
     * Initialize a Standard French Deck.
     */
    public void generateDeck() {


        Deck deck = new Deck();

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                String cardImage = "/" +  i + "-" + j + "image.jpg";
                if (i == 1 || i == 3) {
                    Card card = new Card(j, i, cardImage, "Red");
                    Deck.add(card);
                } else {
                    Card card = new Card(j, i, cardImage, "Black");
                    Deck.add(card);
                }
            }
        }
    }
}
