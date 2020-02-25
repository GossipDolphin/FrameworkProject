package model.Players;

import model.Cards.Card;

import java.util.ArrayList;

public interface IPlayer {
    public ArrayList<Card> showHand();
    public void drawCard();
    public void Quit();
    public void join();
}
