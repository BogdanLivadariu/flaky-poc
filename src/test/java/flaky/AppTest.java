package flaky;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

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
        int count = Integer.parseInt(System.getProperty("surefire.rerunFailingTestsCount"));
        System.out.println("this should always fail if count is less then 4: " + count);
        if (--count < 4) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

    @org.junit.Test
    public void testApp3() {
        int count = Integer.parseInt(System.getProperty("surefire.rerunFailingTestsCount"));
        System.out.println("this should always fail if count is less then 6: " + count);
        if (--count < 6) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }
}
