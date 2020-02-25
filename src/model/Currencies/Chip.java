package model.Currencies;

import java.util.ArrayList;

public abstract class Chip extends Currency {
    Chip(CurrencyBuilder builder) {
        super(builder);
    }

    /**
     *
     * @param currency takes a currency object and uses the amount and rate from the object to generate a list with chips
     * @return a List of Chips as Currencies
     */
    public static ArrayList<Currency> genreateStandardRateChipSetFromRealCurrency(Currency currency){
        double amountChipValue = currency.getAmount() * currency.getRate();
        ArrayList<Currency> ListWithChips = new ArrayList<>();
        int i = 0;
        while (i < amountChipValue){
            if (i < 100){
                ListWithChips.add(new CurrencyBuilder().value(5).color("white").build());
                i += 5;
            }
            else if (i < 300){
                ListWithChips.add(new CurrencyBuilder().value(10).color("Green").build());
                i+=10;
            }
            else if (i < 1000){
                ListWithChips.add(new CurrencyBuilder().value(20).color("Red").build());
                i+=20;
            }
            else if (i < 3000){
                ListWithChips.add(new CurrencyBuilder().value(50).color("Blue").build());
                i +=50;
            }
            else {
                ListWithChips.add(new CurrencyBuilder().value(100).color("Black").build());
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
