package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class Exceptions11TimeoutsTest extends TestCase {

    @Test(expected =ArithmeticException.class)
    public void testDivedByZero() throws Exception {

        Exceptions11Timeouts exc = new Exceptions11Timeouts();
        exc.divedByZero(10,02);

    }
}
