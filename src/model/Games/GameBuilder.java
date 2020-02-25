package model.Games;

import model.Cards.Deck;
import model.Players.Player;
import model.Rules.Rule;

import java.util.ArrayList;
import java.util.Currency;

public class GameBuilder {
    String name;
    Deck readyDeck;
    Deck discardDeck;
    Deck onTableCards;
    ArrayList<Rule> listOfRules;
    ArrayList<Player> listOfPlayers;
    ArrayList<model.Currencies.Currency> innGameCurrencies;

    public GameBuilder name(String name) {
        this.name = name;
        return this;
    }

    public GameBuilder readyDeck(Deck readyDeck) {
        this.readyDeck = readyDeck;
        return this;
    }

    public GameBuilder discardDeck(Deck discardDeck) {
        this.discardDeck = discardDeck;
        return this;
    }

    public GameBuilder onTabelCards(Deck onTableCards) {
        this.onTableCards = onTableCards;
        return this;
    }

    public GameBuilder listOfRules(ArrayList<Rule> listOfRules) {
        this.listOfRules = listOfRules;
        return this;
    }

    public GameBuilder listOfPlayers(ArrayList<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
        return this;
    }

    public GameBuilder innGameCurrencies(ArrayList<model.Currencies.Currency> innGameCurrencies) {
        this.innGameCurrencies = innGameCurrencies;
        return this;
    }

    public Game build() {
        Game game = new Game(this);
        validateGame();
        return game;
    }

    /**
     * validation of the built game object
     */
    private void validateGame() {
    }

}
