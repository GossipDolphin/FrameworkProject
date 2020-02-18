package model.Interfaces;

import model.Currencies.Currency;

public interface ICurrency {
    public float gameCurrencyToRealCurrency(float amount);
    public float RealCurrencyToGameCurrency(float amount);
}
