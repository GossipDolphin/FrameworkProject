import model.Cards.Card;
import model.Cards.CardBuilder;
import model.Cards.Deck;
import model.Cards.DeckBuilder;
import model.Currencies.*;
import model.Games.Game;
import model.Games.GameBuilder;
import model.Players.Player;
import model.Players.PlayerBuilder;
import model.Rules.Rule;
import model.Rules.RuleBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n//-----------Deck test---------------------------------//");
        Deck testDeck = new DeckBuilder().ItalianDeck().build();
        System.out.println(testDeck.toString() + "\n");

        System.out.println("//-----------Card test---------------------------------//");
        Card testCard = new CardBuilder().value(1).suit(2).color("red").image("/Img.jpg").build();
        System.out.println(testCard.toString() + "\n");

        System.out.println("//-----------Rule test---------------------------------//");
        //Still thinking about how to implement rule class.
        Rule testRule = new RuleBuilder().number(1).name("Straight Flush").description("This rules wins if the players cards matches in suit and value scaling upwards.").priority(1).build();
        System.out.println(testRule.toString() + "\n");

        System.out.println("//-----------Currencies and converting test------------//");
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
        System.out.println(dollar + "\n");

        System.out.println("//-----------Chip extends currencies test--------------//");
        ArrayList<Currency> ListWithChips = Chip.genreateStandardRateChipSetFromRealCurrency(new CurrencyBuilder().amount(300).rate(5).build());
        System.out.println(ListWithChips + "\n");

        System.out.println("//-----------Player test-------------------------------//");
        Player player = new PlayerBuilder().playerName("Konrad").playerNo(1).ranking(1).build();
        System.out.println(player + "\n");

        System.out.println("//-----------Game test---------------------------------//");
        Game game = new GameBuilder().name("poker").innGameCurrencies(ListWithChips).build();
        System.out.println(game + "\n");
    }
}
