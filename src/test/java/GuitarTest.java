import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("red", "Guitar", 10.00, 20.00, "Nike", 10.00);
    }
    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }
    @Test
    public void hasColour(){
        assertEquals("red", guitar.getColour());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(10.00, guitar.getBuyPrice(),0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(20.00, guitar.getSellPrice(),0.01);
    }
    @Test
    public void hasBrand(){
        assertEquals("Nike", guitar.getBrand());
    }
    @Test
    public void hasNumOfStrings(){
        assertEquals(10.00, guitar.getNumOfStrings(),0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Braap braap", guitar.play());
    }
    @Test
    public void checkMarkUp(){
        assertEquals(10.0, guitar.calcMarkUp(), 0.01);
    }

}
