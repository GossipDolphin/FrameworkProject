package model;

import java.util.ArrayList;
import java.util.Currency;

public class PlayerBuilder {
    ArrayList<Card> hand;
    String playerName;
    int playerNo;
    int gamesWon;
    int gamesLost;
    int ranking;
    ArrayList<Currency> playerChips;
    Currency playerCurrency;

    public PlayerBuilder hand( ArrayList<Card> hand){
        this.hand = hand;
        return this;
    }

    public  PlayerBuilder playerName( String playerName){
        this.playerName = playerName;
        return this;
    }

    public PlayerBuilder playerNo( int playerNo){
        this.playerNo = playerNo;
        return this;
    }

    public PlayerBuilder gamesWon( int gamesWon){
        this.gamesWon = gamesWon;
        return this;
    }

    public PlayerBuilder gamesLost( int gamesLost){
        this.gamesLost = gamesLost;
        return this;
    }

    public PlayerBuilder ranking( int ranking){
        this.ranking = ranking;
        return this;
    }

    public PlayerBuilder playerChips (ArrayList<Currency> playerChips){
        this.playerChips = playerChips;
        return this;
    }

    public PlayerBuilder playerCurrency (Currency playerCurrency){
        this.playerCurrency = playerCurrency;
        return this;
    }
}
