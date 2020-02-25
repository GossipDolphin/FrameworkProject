import model.*;
import model.Currencies.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Deck testDeck = new DeckBuilder().ItalianDeck().build();
        System.out.println(testDeck.toString());

        Card testCard = new CardBuilder().value(1).suit(2).color("red").image("/Img.jpg").build();
        System.out.println(testCard.toString());


        //Still thinking about how to implement rule class.
        Rule testRule = new RuleBuilder().number(1).name("Straight Flush").description("This rules wins if the players cards matches in suit and value scaling upwards.").priority(1).build();
        System.out.println(testRule.toString());

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

        ArrayList<Currency> ListWithChips = Chip.genreateStandardRateChipSetFromRealCurrency(new CurrencyBuilder().amount(300).rate(5).build());
        System.out.println(ListWithChips);

    }
}
