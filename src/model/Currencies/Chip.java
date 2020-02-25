package model.Currencies;

import java.util.ArrayList;

public class Chip extends Currency {
    Chip(CurrencyBuilder builder) {
        super(builder);
    }

    public static ArrayList<Chip> genreateStandardRateChipSetFromRealCurrency(Currency currency){
        double amountChipValue = currency.getAmount() * currency.getRate();
        ArrayList<Chip> ListWithChips = new ArrayList<>();
        for (int i = 0; i < amountChipValue; i+=5){
            if (i < 100){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(5).color("white")));
            }
            else if (i < 300){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(10).color("Green")));
            }
            else if (i < 500){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(20).color("Red")));
            }
            else if (i < 1000){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(50).color("Blue")));
            }
            else {
                ListWithChips.add(new Chip(new CurrencyBuilder().value(100).color("Black")));
            }
        }
        return ListWithChips;

    }

    @Override
    public String toString(){
        return this.getColor() + " " + this.getValue();
    }
}
