package model;

import java.util.ArrayList;
import java.util.Random;

public class Deck {


    public String deckName;
    public ArrayList<Card> DeckOfCards;
    Random r = new Random();


    /**
     *
     * @param builder Takes in parameter for Deckbuilder consisting of a builder with the name of the deck and the Deck itself.
     */
    Deck(DeckBuilder builder) {
        this.deckName = builder.deckName;
        this.DeckOfCards = builder.DeckOfCards;

    }



    public String getDeckName() {
        return deckName;
    }

    public ArrayList<Card> getDeckOfCards() {
        return DeckOfCards;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "deckName='" + deckName + '\'' +
                ", DeckOfCards=" + DeckOfCards +
                '}';
    }




    /**
     * Show All the cards in the deck.
     */
    public void showCards() {
        System.out.println("\n\n Showing Cards !!!");
        int i = 1;
        for (Card c : DeckOfCards) {
            System.out.println("Card " + (i++) + " : " + c.toString());
        }
    }

    /**
     * Shuffle the deck by mixing up the order of the cards.
     */
    public void shuffle() {

        ArrayList<Card> temp = new ArrayList<>();
        while (!DeckOfCards.isEmpty()) {
            int loc = (int) (Math.random() * DeckOfCards.size());
            temp.add(DeckOfCards.get(loc));
            DeckOfCards.remove(loc);
        }
        DeckOfCards = temp;
    }









}

