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
    public void hasColour(){
        assertEquals("red", guitar.getColour() );
    }

}
