package model;

import model.Deck;

import java.util.ArrayList;
import java.util.Random;

public class DeckBuilder {

    public String deckName;
    public ArrayList<Card> DeckOfCards;
    Random r = new Random();


    /**
     *
     * @param deckName Insert the wanted name of the Deck
     * @return
     */
    public DeckBuilder Name(String deckName){
        this.deckName = deckName;
        return this;
    }

    /**
     *
     * @param DeckOfCards Insert the Arraylist of cards wanted in the deck.
     * @return
     */
    public DeckBuilder CardList(ArrayList<Card> DeckOfCards){
        this.DeckOfCards= DeckOfCards;
        return this;
    }

    /**
     *
     * @return Auto Generates a Deck of French Cards.
     */
    public DeckBuilder FrenchDeck(){

            Deck FrenchDeck = new DeckBuilder().Name("French Deck").CardList(DeckOfCards).build();
            this.DeckOfCards = new ArrayList<>();
            GenerateCards("French");

            return this;

        }

    /**
     *
     * @return Auto Generates a deck of Italian Cards.
     */
    public DeckBuilder ItalianDeck(){

        Deck ItalianDeck = new DeckBuilder().Name("French Deck").CardList(DeckOfCards).build();
        this.DeckOfCards = new ArrayList<>();
        GenerateCards("Italian");

        return this;

    }

    /**
     *
     * @return Auto Generates a deck of Swiss Cards.
     */
    public DeckBuilder SwissDeck(){

        Deck SwissDeck = new DeckBuilder().Name("Swiss Deck").CardList(DeckOfCards).build();
        this.DeckOfCards = new ArrayList<>();
        GenerateCards("Swiss");

        return this;

    }

    /**
     *
     * @return Initialize the Build Sequence of a Deck.
     */
    public Deck build(){
        Deck deck = new Deck(this);
        validateCardObject(deck);
        return deck;

    }

    /**
     *
     * @param deck Validates the deck PS: need to implement wanted tests.
     */
    private void validateCardObject(Deck deck){
        if (deck.getDeckOfCards().size() > 52 || deck.getDeckOfCards().size() < 1){
            System.out.println("Invalid User input on Deck Size. Must be between 1 and 52");
        }

    }

    /**
     *
     * @param family Eg. French, Italian, Swiss (Will start generation Process of a Deck.
     */
    public void GenerateCards(String family){

            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 13; j++) {
                    String cardImage = "/" + i + "-" + j + family + "Image.jpg";
                    if (i == 1 || i == 3) {
                        Card card = new CardBuilder().value(j).suit(i).color("Red").image(cardImage).build();
                        DeckOfCards.add(card);
                    } else {
                        Card card = new CardBuilder().value(j).suit(i).color("Black").image(cardImage).build();
                        DeckOfCards.add(card);
                    }
                }
            }
        }

}
