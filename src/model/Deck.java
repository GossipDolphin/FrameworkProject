package model;

import java.util.ArrayList;
import java.util.Random;

public class Deck {


    public String deckName;
    public ArrayList<Card> DeckOfCards;
    Random r = new Random();



    /**
     * @param deckName Specifies the name of the Deck
     * @param deckOfCards  Arraylist of type Cards which are contained in the deck.
     */
    public Deck(String deckName, ArrayList<Card> deckOfCards) {
        this.deckName = deckName;
        DeckOfCards = deckOfCards;
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

    public ArrayList<Card> getDeckOfCards() {
        return DeckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        DeckOfCards = deckOfCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckName='" + deckName + '\'' +
                ", DeckOfCards=" + DeckOfCards +
                '}';
    }

    /**
     * Initialize a Standard French Deck.
     */
    public void generateDeck() {


        Deck decks = new Deck("First Deck", DeckOfCards);
        this.DeckOfCards = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String cardImage = "/" + i + "-" + j + "image.jpg";
                if (i == 1 || i == 3) {
                    DeckOfCards.add(new Card(j, i,"Red", cardImage));
                } else {
                    DeckOfCards.add(new Card(j, i,"Black",cardImage));
                }
            }
        }

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

