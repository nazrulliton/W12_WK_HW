package Shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public int getStockSize(){
        return stock.size();
    }



    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }




}
