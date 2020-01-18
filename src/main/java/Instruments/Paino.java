package Instruments;

public class Paino extends Instrument{
    private double numOfKeys;
    public Paino(String colour, String type, double buyPrice, double sellPrice, String brand, double numOfKeys) {
        super(colour, type, buyPrice, sellPrice, brand);
        this.numOfKeys = numOfKeys;
    }

    public double getNumOfKeys() {
        return numOfKeys;
    }
}
