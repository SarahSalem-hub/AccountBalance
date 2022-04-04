import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class trainsTest {
    Trains T;
    @Before
    public void setUp() throws Exception {
        T = new Trains();
    }

    @Test
    public void lessthan9half() {
        String res = T.rushHour(8.30);
        assertEquals("pay full fare",res);
    }
    @Test
    public void Equalto9half() {
        String res = T.rushHour(9.30);
        assertEquals("pay full fare",res);
    }
    @Test
    public void Greaterthan9half() {
        String res = T.rushHour(10.30);
        assertEquals("A saver ticket is available",res);
    }
    @Test
    public void between4and7half() {
        String res = T.rushHour(17.30);
        assertEquals("pay full fare",res);
    }

    @Test
    public void Equalto4() {
        String res = T.rushHour(16.00);
        assertEquals("pay full fare",res);
    }
    @Test
    public void Equalto7half() {
        String res = T.rushHour(19.30);
        assertEquals("pay full fare",res);
    }

    @Test
    public void after7half() {
        String res = T.rushHour(20.30);
        assertEquals("A saver ticket is available",res);
    }
}