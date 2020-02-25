import model.Currencies.*;
import model.Deck;

public class Main {

    public static void main(String[] args) {

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
    }
}
