package Instruments;

public abstract class Instrument {
    private  String colour;
    private  InstrumentTypes type;
    private  double buyPrice;
    private  double sellPrice;
    private String brand;

    public Instrument(String colour, InstrumentTypes type, double buyPrice, double sellPrice, String brand){
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.brand = brand;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentTypes getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }
}

