package model;

import model.Deck;

import java.util.ArrayList;
import java.util.Random;

public class DeckBuilder {

    public String deckName;
    public ArrayList<Card> DeckOfCards;
    Random r = new Random();



    public DeckBuilder Name(String deckName){
        this.deckName = deckName;
        return this;
    }

    public DeckBuilder CardList(ArrayList<Card> DeckOfCards){
        this.DeckOfCards= DeckOfCards;
        return this;
    }

    public DeckBuilder FrenchDeck(){

            Deck FrenchDeck = new DeckBuilder().Name("French Deck").CardList(DeckOfCards).build();
            this.DeckOfCards = new ArrayList<>();
            GenerateCards("French");

            return this;

        }

    public DeckBuilder ItalianDeck(){

        Deck ItalianDeck = new DeckBuilder().Name("French Deck").CardList(DeckOfCards).build();
        this.DeckOfCards = new ArrayList<>();
        GenerateCards("Italian");

        return this;

    }

    public DeckBuilder SwissDeck(){

        Deck SwissDeck = new DeckBuilder().Name("Swiss Deck").CardList(DeckOfCards).build();
        this.DeckOfCards = new ArrayList<>();
        GenerateCards("Swiss");

        return this;

    }

    public Deck build(){
        Deck deck = new Deck(this);
        validateCardObject(deck);
        return deck;

    }

    private void validateCardObject(Deck deck){
        //Validation here
    }

    /**
     *
     * @param family Eg. French, Italian, Swiss
     */
    public void GenerateCards(String family){

            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 13; j++) {
                    String cardImage = "/" + i + "-" + j + family + "Image.jpg";
                    if (i == 1 || i == 3) {
                        Card card = new CardBuilder().value(j).rank(i).color("Red").image(cardImage).build();
                        DeckOfCards.add(card);
                    } else {
                        Card card = new CardBuilder().value(j).rank(i).color("Black").image(cardImage).build();
                        DeckOfCards.add(card);
                    }
                }
            }
        }

}
