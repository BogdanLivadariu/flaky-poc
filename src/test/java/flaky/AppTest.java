package flaky;

import static org.junit.Assert.assertTrue;

import org.jenkinsci.testinprogress.runner.ProgressSuite;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(ProgressSuite.class)
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
    public void testApp2() throws InterruptedException {
        int count = Integer.parseInt(System.getProperty("surefire.rerunFailingTestsCount"));
        System.out.println("this should always fail if count is less then 4: " + count);
        Thread.sleep(10000);
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
