import model.Currencies.Chip;
import model.Currencies.Currency;
import model.Deck;

public class Main {

    public static void main(String[] args) {

        Deck decker = new Deck();

        decker.generateDeck();

        decker.shuffle();

        decker.showCards();

        System.out.println(Chip.GenerateChipSet(100, new Currency(5)));

    }
}
