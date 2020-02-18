package model;

import model.Interfaces.ICurrency;

import java.util.ArrayList;

public class Chip implements ICurrency {

    private String color;
    private int value;

    /**
     * @param color  color of the value of the chip. white == 5, red == 10, green == 20, blue == 50, black == 100.
     * @param value The total value of the type of chip.
     */
    public Chip(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public Chip() {
    }

    /**
     *
     * @param value The total amount of chipvalue
     * @param rate the rate of the transfer
     * @return returns the value / rate
     */
    public int ChipValueToDollar(int value, int rate){
        return value / rate;
    }

    /**
     *
     * @param value the total amount of chipvalue
     * @return basic rate of 5 chipvalues == one dollar. return the amoount of chipvalue/5
     */
    public int ChipValueToDollarStandardRate(int value){
        return value / 5;
    }

    /**
     *
     * @param DollarAmount The amount of dollars wich vil be transferred to chipvalue
     * @param rate The rate of the transfer
     * @return returns DollarAmount*rate
     */
    public int DollarToChipValue(int DollarAmount, int rate){
        return DollarAmount * rate;
    }

    /**
     *
     * @param DollarAmount The total amount of dollars
     * @return the dollars*5 at the basic rate of 5
     */
    public int DollarToChipValueStandardRate(int DollarAmount){
        return DollarAmount * 5;
    }

    /**
     *
     * @param DollarAmount amount of dollars to transfer to chips
     * @param rate the rate of how much one dollar is equal to in chip value. standard rate is 5.
     * @return returns a arraylist of type Chip
     */
    public ArrayList<Chip> GenerateChipSet(int DollarAmount, int rate){
        ArrayList<Chip> ListWithChips = new ArrayList<>();
        int ChipValue = DollarToChipValue(DollarAmount, rate);
        int MaxWhiteChips = 20;
        int MaxRedChip = 20;
        int MaxGreenChip = 20;
        int MaxBlueChip = 20;

        for(int i = 0; i < ChipValue; i=i+5){
            if (i%5==0 && i<MaxWhiteChips){
                ListWithChips.add(new Chip("White", 5));
            }
            else if (i%10==0 && i < MaxRedChip){
                ListWithChips.add(new Chip("Red", 10));
            }
            else if (i%20 == 0 && i < MaxGreenChip){
                ListWithChips.add(new Chip("Green", 20));
            }
            else if(i%50 == 0 && i < MaxBlueChip){
                ListWithChips.add(new Chip("Blue", 50));
            }
            else if(i%100 == 0){
                ListWithChips.add(new Chip("Black", 100));
            }
        }
        return ListWithChips;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
