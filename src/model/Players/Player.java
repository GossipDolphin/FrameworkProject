package model.Players;

import model.Card;

import java.util.ArrayList;
import java.util.Currency;

public class Player implements IPlayer {

    private ArrayList<Card> hand;
    private String playerName;
    private int playerNo;
    private int gamesWon;
    private int gamesLost;
    private int ranking;
    private ArrayList<Currency> playerChips;
    private Currency playerCurrency;

   Player (PlayerBuilder builder){
        this.hand= builder.hand;
        this.playerName = builder.playerName;
        this.playerNo = builder.playerNo;
        this.gamesWon = builder.gamesWon;
        this.gamesLost = builder.gamesLost;
        this.ranking = builder.ranking;
        this.playerChips = builder.playerChips;
        this.playerCurrency = builder.playerCurrency;
   }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getRanking() {
        return ranking;
    }

    public ArrayList<Currency> getPlayerChips() {
        return playerChips;
    }

    public Currency getPlayerCurrency() {
        return playerCurrency;
    }
}
