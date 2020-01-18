import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;
import sun.security.provider.SHA;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Music", 100.00);
        guitar = new Guitar("red", "Guitar", 10.00, 20.00, "Nike", 10.00);
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
}
