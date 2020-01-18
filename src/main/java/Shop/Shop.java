package Shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public void Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }



}
