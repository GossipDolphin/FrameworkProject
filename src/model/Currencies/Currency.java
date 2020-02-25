package model.Currencies;

public class Currency implements ICurrency{
    private String name;
    private String color;
    private double rate;
    private double amount;
    private double value;

    Currency(CurrencyBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.rate = builder.rate;
        this.amount = builder.amount;
        this.value = builder.value;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getRate() {
        return rate;
    }

    public double getAmount() {
        return amount;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency: " + "Name: " + this.name + " color: " + this.color + " rate: " + this.rate + " amount: " + this.amount + " value: " + this.value;
    }

    /**
     * Converts the currencie inwoken on to the currency given ass parameter
     * @param currency The currency to convert to
     * @return returns the currencie inwoken on as the currency given
     */
    @Override
    public Currency convertToAnotherCurrency(Currency currency) {
        this.name = currency.name;
        this.color = currency.color;
        this.rate = currency.rate;
        this.amount = this.amount * currency.rate;
        this.value = currency.value;
        return this;
    }
}
