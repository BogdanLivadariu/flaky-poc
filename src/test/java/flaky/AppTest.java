package flaky;

import static org.junit.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    static int count = 0;

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public void testApp() {
        System.out.println("this should always pass");
        assertTrue(true);
    }

    @org.junit.Test
    public void testApp2() {
        count++;
        System.out.println("this should always fail if count is less then 4: " + count);
        if (--count < 4) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }
}
