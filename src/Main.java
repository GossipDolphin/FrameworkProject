import model.Card;
import model.Deck;
import model.CardBuilder;

public class Main {

    public static void main(String[] args) {

        Deck decker = new Deck();

        decker.generateDeck();

        decker.shuffle();

        decker.showCards();

        Card cardx = new CardBuilder().value(1).rank(1).color("black").image("/aceOfSpades.jpg").build();

        System.out.println(cardx);

    }
}
