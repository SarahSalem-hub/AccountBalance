import org.junit.Before;

import static org.junit.Assert.*;

public class BalanceTest {
    Balance b ;
    @Before
    public void setUp() throws Exception {
        b = new Balance();
    }

    @org.junit.Test
    public void lessthan0() {
    String result = b.account(-1);
    assertEquals("Invalid",result);

    }

    @org.junit.Test
    public void Equalto0() {
        String result = b.account(0);
        assertEquals("3%",result);

    }

    @org.junit.Test
    public void Equalto50() {
        String result = b.account(50);
        assertEquals("3%",result);

    }

    @org.junit.Test
    public void Equalto99() {
        String result = b.account(99);
        assertEquals("3%",result);

    }
    @org.junit.Test
    public void Equalto100() {
        String result = b.account(100);
        assertEquals("3%",result);

    }

    @org.junit.Test
    public void Equalto500() {
        String result = b.account(500);
        assertEquals("5%",result);

    }

    @org.junit.Test
    public void Equalto1000() {
        String result = b.account(100);
        assertEquals("3%",result);

    }

    @org.junit.Test
    public void Equalto1001() {
        String result = b.account(1001);
        assertEquals("7%",result);

    }

    @org.junit.Test
    public void Equalto2000() {
        String result = b.account(100);
        assertEquals("3%",result);

    }
}