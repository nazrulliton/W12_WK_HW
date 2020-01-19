import Instruments.Guitar;
import Instruments.InstrumentTypes;
import Instruments.Sax;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;
import sun.security.provider.SHA;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Sax sax;

    @Before
    public void before(){
        shop = new Shop("Music", 100.00);
        guitar = new Guitar("red", InstrumentTypes.STRING, 10.00, 20.00, "Nike", 10.00);
        sax = new Sax("Red", InstrumentTypes.VALVE, 15.00, 45.00, "Dopsi", 30);
        shop.addToStock(sax);
        shop.addToStock(guitar);
    }
    @Test
    public void hasName(){
        assertEquals("Music", shop.getName());
    }
    @Test
    public void hasTill(){
        assertEquals(100.00, shop.getTill(), 0.01);
    }
    @Test
    public void canAddToStock(){
        assertEquals(1, shop.getStockSize());
    }
    @Test
    public void canRemoveFromStock(){
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStockSize());
    }
    @Test
    public void canGetPotentialProfit(){
        assertEquals(40.0, shop.getPotentialProfit(), 0.01);
    }
}
