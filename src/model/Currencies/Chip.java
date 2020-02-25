package model.Currencies;

import java.util.ArrayList;

public class Chip extends Currency {
    Chip(CurrencyBuilder builder) {
        super(builder);
    }

    /**
     *
     * @param currency takes a currency object and uses the amount and rate from the object to generate a list with chips
     * @return
     */
    public static ArrayList<Chip> genreateStandardRateChipSetFromRealCurrency(Currency currency){
        double amountChipValue = currency.getAmount() * currency.getRate();
        ArrayList<Chip> ListWithChips = new ArrayList<>();
        int i = 0;
        while (i < amountChipValue){
            if (i < 100){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(5).color("white")));
                i += 5;
            }
            else if (i < 300){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(10).color("Green")));
                i+=10;
            }
            else if (i < 1000){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(20).color("Red")));
                i+=20;
            }
            else if (i < 3000){
                ListWithChips.add(new Chip(new CurrencyBuilder().value(50).color("Blue")));
                i +=50;
            }
            else {
                ListWithChips.add(new Chip(new CurrencyBuilder().value(100).color("Black")));
                i += 100;
            }
        }
        return ListWithChips;

    }

    @Override
    public String toString(){
        return this.getColor() + " " + this.getValue();
    }
}
