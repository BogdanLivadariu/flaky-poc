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
        System.out.println("this should always fail");
        assertTrue(false);
    }
}
