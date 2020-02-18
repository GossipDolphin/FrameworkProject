import model.Card;
import model.Deck;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {

    public static void main(String[] args) {

        Deck decker = new Deck();

        decker.generateDeck();

        decker.shuffle();

        decker.showCards();

    }
}
