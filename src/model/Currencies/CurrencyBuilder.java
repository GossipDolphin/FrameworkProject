package model.Currencies;

public class CurrencyBuilder {
    String name;
    String color;
    double rate;
    double amount;
    double value;

    public CurrencyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CurrencyBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CurrencyBuilder rate(double rate) {
        this.rate = rate;
        return this;
    }

    public CurrencyBuilder amount(double amount) {
        this.amount = amount;
        return this;
    }

    public CurrencyBuilder value(double value) {
        this.value = value;
        return this;
    }

    public Currency build() {
        Currency currency = new Currency(this);
        validateCurrency(currency);
        return currency;
    }

    private void validateCurrency(Currency currency) {
        //make validation of the object, not allow random stuff, to be continued
    }

}
