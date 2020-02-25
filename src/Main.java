import model.Card;
import model.CardBuilder;
import model.Currencies.*;
import model.Deck;
import model.DeckBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Deck testDeck = new DeckBuilder().Name("Testingdecks").ItalianDeck().build();
        System.out.println(testDeck.toString());

        Deck testDeck2 = new DeckBuilder().Name("Testingdecks").FrenchDeck().build();
        System.out.println(testDeck2.toString());

        Deck testDeck3 = new DeckBuilder().Name("Testingdecks").SwissDeck().build();
        System.out.println(testDeck3.toString());

        Card testCard = new CardBuilder().value(1).rank(2).color("red").image("/Img.jpg").build();
        System.out.println(testCard.toString());
        System.out.println("before convert");
        Currency dollar = new CurrencyBuilder().name("dollar").rate(0.2).value(9).amount(100).build();
        System.out.println(dollar);

        Currency chip = new CurrencyBuilder().name("chip").color("white").value(5).rate(5).build();
        System.out.println(chip + "\n");

        System.out.println("After convert dollar to chip:");
        dollar.convertToAnotherCurrency(chip);
        System.out.println(dollar + "\n");

        System.out.println("convert back again to dollar");
        dollar.convertToAnotherCurrency(new CurrencyBuilder().name("dollar").rate(0.2).value(9).amount(100).build());
        System.out.println(dollar);

        ArrayList ListWithChips = Chip.genreateStandardRateChipSetFromRealCurrency(new CurrencyBuilder().amount(300).rate(5).build());
        System.out.println(ListWithChips);


    }
}
