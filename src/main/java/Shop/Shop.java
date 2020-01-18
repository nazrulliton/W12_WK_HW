package Shop;

import Instruments.Sax;
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public void Shop(String name, double till){
        this.name = name;
        this.till = till;
        stock = new ArrayList<ISell>();

    }

    public int getStockSize(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }


    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }
}
