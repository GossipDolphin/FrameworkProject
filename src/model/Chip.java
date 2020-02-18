package model;

import model.Interfaces.ICurrency;

public class Chip implements ICurrency {


    private String color;


    private int amount;


    /**
     * @param color  color of the value of the chip. white == 5, red == 10, green == 20, blue == 50, black == 100.
     * @param amount The total amount of the type of chip.
     */

    public Chip(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    public Chip() {
        //Empty constructor
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
