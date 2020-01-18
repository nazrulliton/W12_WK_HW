package Instruments;

import behaviours.IPlay;

public class Paino extends Instrument implements IPlay {
    private double numOfKeys;
    public Paino(String colour, String type, double buyPrice, double sellPrice, String brand, double numOfKeys) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfKeys = numOfKeys;
    }

    public double getNumOfKeys() {
        return numOfKeys;
    }

    public String play() {
        return "Ding Dong";
    }
}
