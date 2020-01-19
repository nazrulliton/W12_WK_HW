package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Sax extends Instrument implements IPlay, ISell {
    private double numOfValves;
    public Sax(String colour, InstrumentTypes type, double buyPrice, double sellPrice, String brand, double numOfValves) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfValves = numOfValves;
    }

    public double getNumOfValves() {
        return numOfValves;
    }

    public String play() {
        return "Dadaada";
    }

    public double calcMarkUp() {
        double result = getSellPrice() - getBuyPrice();
        return result;
    }
}
