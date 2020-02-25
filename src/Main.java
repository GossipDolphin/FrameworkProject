import model.Card;
import model.CardBuilder;
import model.Currencies.Currency;
import model.Deck;
import model.DeckBuilder;

public class Main {

    public static void main(String[] args) {

        Deck deckTest = new DeckBuilder().FrenchDeck().build();

        Card cardTest = new CardBuilder().value(1).rank(2).color("black").image("/aceOfSpades.jpg").build();


        System.out.println(deckTest);

    }
}
