package model;

import java.util.ArrayList;
import java.util.Currency;

public class Player {

    public ArrayList<Card> hand = new ArrayList<>();
    public String playerName;
    public int playerNo;
    public int gamesWon;
    public int gamesLost;
    public int ranking;
    public ArrayList<Currency> PlayerChips = new ArrayList<>();
    public ArrayList<Currency> PlayerCurrency = new ArrayList<>();

    public ArrayList<Player> playerList = new ArrayList<>();


    /**
     * Player information and status
     * @param hand hand of player in game.
     * @param playerName Name of the Player.
     * @param playerNo Number of the player on specific Games.
     * @param gamesWon Number of games player has won.
     * @param gamesLost Numbers of games player has loss.
     * @param ranking Global ranking of player from statistics.
     * @param playerChips Amount of Chips player has to spend in games.
     * @param playerCurrency Amount of Cash /currency player has at disposal to buy Chips.
     */
    public Player(ArrayList<Card> hand, String playerName, int playerNo, int gamesWon, int gamesLost, int ranking, ArrayList<Currency> playerChips, ArrayList<Currency> playerCurrency) {
        this.hand = hand;
        this.playerName = playerName;
        this.playerNo = playerNo;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.ranking = ranking;
        PlayerChips = playerChips;
        PlayerCurrency = playerCurrency;
    }

    public Player(ArrayList<Card> hand, String playerName, int playerNo, int gamesWon, int gamesLost, int ranking) {
        this.hand = hand;
        this.playerName = playerName;
        this.playerNo = playerNo;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.ranking = ranking;
    }

    public Player(){
        //Empty Constructor.
    }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Currency> getPlayerChips() {
        return PlayerChips;
    }

    public void setPlayerChips(ArrayList<Currency> playerChips) {
        PlayerChips = playerChips;
    }

    public ArrayList<Currency> getPlayerCurrency() {
        return PlayerCurrency;
    }

    public void setPlayerCurrency(ArrayList<Currency> playerCurrency) {
        PlayerCurrency = playerCurrency;
    }

    /**
     * Generates players based on number of players.
     * @param numberOfPlayers
     */
    public void generateRandomPlayer(int numberOfPlayers){

        for(int i=0; i< numberOfPlayers; i++){

            playerList.add(new Player(hand,"player"+ " :" + i,i,0,0,0));
        }


    }
}
