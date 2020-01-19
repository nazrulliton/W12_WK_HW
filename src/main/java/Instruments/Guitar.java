package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar  extends Instrument implements IPlay, ISell {
        private double numOfStrings;

    public Guitar(String colour, InstrumentTypes type, double buyPrice, double sellPrice, String brand, double numOfStrings) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfStrings = numOfStrings;
    }


    public double getNumOfStrings() {
        return numOfStrings;
    }


    public String play() {
        return "Braap braap";
    }

    public double calcMarkUp() {
        double result = getSellPrice() - getBuyPrice();
        return result;
    }
    public void setNumOfStrings(double numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

}
