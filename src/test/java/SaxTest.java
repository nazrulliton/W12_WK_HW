import Instruments.Sax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {
    Sax sax;
    @Before
    public void before(){
        sax = new Sax ("Red", "sax", 15.00, 45.00, "Dopsi", 30);
    }
    @Test
    public void canGetNumOfValves(){
        assertEquals(30, sax.getNumOfValves(), 0.01 );
    }
    @Test
    public void canPlay(){
        assertEquals("Dadaada", sax.play());
    }
    @Test
    public void checkMarkUp(){
        assertEquals(300.0, sax.calcMarkUp(), 0.01);
    }
}
