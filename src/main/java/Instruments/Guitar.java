package Instruments;

public class Guitar  extends Instrument {
        private double numOfStrings;

    public Guitar(String colour, String type, double buyPrice, double sellPrice, String brand, double numOfStrings) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfStrings = numOfStrings;
    }


    public double getNumOfStrings() {
        return numOfStrings;
    }
}
