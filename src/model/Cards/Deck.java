package model.Cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {


    public String deckName;
    public ArrayList<Card> deckOfCards;
    Random r = new Random();


    /**
     * @param builder Takes in parameter for Deckbuilder consisting of a builder with the name of the deck and the Deck itself.
     */
    Deck(DeckBuilder builder) {
        this.deckName = builder.deckName;
        this.deckOfCards = builder.deckOfCards;

    }


    public String getDeckName() {
        return deckName;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "deckName='" + deckName + '\'' +
                ", deckOfCards=" + deckOfCards +
                '}';
    }


    /**
     * Show All the cards in the deck.
     */
    public void showCards() {
        System.out.println("\n\n Showing Cards !!!");
        int i = 1;
        for (Card c : deckOfCards) {
            System.out.println("Card " + (i++) + " : " + c.toString());
        }
    }

    /**
     * Shuffle the deck by mixing up the order of the cards.
     */
    public void shuffle() {

        ArrayList<Card> temp = new ArrayList<>();
        while (!deckOfCards.isEmpty()) {
            int loc = (int) (Math.random() * deckOfCards.size());
            temp.add(deckOfCards.get(loc));
            deckOfCards.remove(loc);
        }
        deckOfCards = temp;
    }


}

