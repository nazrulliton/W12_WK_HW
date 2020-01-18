import Instruments.Paino;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Paino paino;
    @Before
    public void before(){
        paino = new Paino("Black", "paino", 20.00, 40.00, "Helms", 40 );
    }
    @Test
    public void canGetNumOfKeys(){
        assertEquals(40,paino.getNumOfKeys(),0.01 );
    }
    @Test
    public void canPlay(){
        assertEquals("Ding Dong", paino.play());
    }
}
