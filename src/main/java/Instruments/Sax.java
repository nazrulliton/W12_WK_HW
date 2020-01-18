package Instruments;

import behaviours.IPlay;

public class Sax extends Instrument implements IPlay {
    private double numOfValves;
    public Sax(String colour, String type, double buyPrice, double sellPrice, String brand, double numOfValves) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfValves = numOfValves;
    }

    public double getNumOfValves() {
        return numOfValves;
    }

    public String play() {
        return "Dadaada";
    }
}
