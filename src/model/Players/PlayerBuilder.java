package model.Players;

import model.Card;

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

    public Player build(){
        Player player = new Player(this);
        validatePlayer(player);
        return player;
    }

    /**
     * Makes some validation if the Player has been correctly built
     * @param player player object up for validation
     */
    private void validatePlayer(Player player) {
    }

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
