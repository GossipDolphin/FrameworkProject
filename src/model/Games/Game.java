package model.Games;

import model.Cards.Deck;
import model.Players.Player;
import model.Rules.Rule;

import java.util.ArrayList;
import java.util.Currency;

public class Game implements IGame {

    private String name;
    private Deck readyDeck;
    private Deck discardDeck;
    private Deck onTableCards;
    private ArrayList<Rule> listOfRules;
    private ArrayList<Player> listOfPlayers;
    private ArrayList<model.Currencies.Currency> innGameCurrencies;

    Game(GameBuilder builder) {
        this.name = builder.name;
        this.readyDeck = builder.readyDeck;
        this.discardDeck = builder.discardDeck;
        this.onTableCards = builder.onTableCards;
        this.listOfRules = builder.listOfRules;
        this.listOfPlayers = builder.listOfPlayers;
        this.innGameCurrencies = builder.innGameCurrencies;
    }

    @Override
    public void start() {

    }

    @Override
    public void end() {

    }

    @Override
    public void win() {

    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Players" + this.listOfPlayers;
    }

    public String getName() {
        return name;
    }

    public Deck getReadyDeck() {
        return readyDeck;
    }

    public Deck getDiscardDeck() {
        return discardDeck;
    }

    public Deck getOnTableCards() {
        return onTableCards;
    }

    public ArrayList<Rule> getListOfRules() {
        return listOfRules;
    }

    public ArrayList<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public ArrayList<model.Currencies.Currency> getInnGameCurrencies() {
        return innGameCurrencies;
    }
}
