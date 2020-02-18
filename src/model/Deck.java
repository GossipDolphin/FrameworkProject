package model;

import java.util.ArrayList;
import java.util.Random;

public class Deck {


    public String deckName;
    public ArrayList<Card> DeckTest;
    Random r = new Random();

    public Deck(String deckName, ArrayList<Card> deckTest) {
        this.deckName = deckName;
        DeckTest = deckTest;
    }

    /**
     * @param deckName Specifies the name of the Deck
     * @param deck  Arraylist of type Cards which are contained in the deck.
     */


    public Deck() {
        // Empty constructor
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public ArrayList<Card> getDeckTest() {
        return DeckTest;
    }

    public void setDeckTest(ArrayList<Card> deckTest) {
        DeckTest = deckTest;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckName='" + deckName + '\'' +
                ", DeckTest=" + DeckTest +
                '}';
    }

    /**
     * Initialize a Standard French Deck.
     */
    public void generateDeck() {


        Deck decks = new Deck("First Deck",DeckTest);
        this.DeckTest = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String cardImage = "/" + i + "-" + j + "image.jpg";
                if (i == 1 || i == 3) {
                    DeckTest.add(new Card(j, i,"Red", cardImage));
                } else {
                    DeckTest.add(new Card(j, i,"Black",cardImage));
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
        for (Card c : DeckTest) {
            System.out.println("Card " + (i++) + " : " + c.toString());
        }
    }

    /**
     * Shuffle the deck by mixing up the order of the cards.
     */
    public void shuffle() {

        ArrayList<Card> temp = new ArrayList<>();
        while (!DeckTest.isEmpty()) {
            int loc = (int) (Math.random() * DeckTest.size());
            temp.add(DeckTest.get(loc));
            DeckTest.remove(loc);
        }
        DeckTest = temp;
    }









}

