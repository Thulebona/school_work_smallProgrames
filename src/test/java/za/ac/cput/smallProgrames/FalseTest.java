package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class FalseTest extends TestCase {

    @Test
    public void testOddNum() throws Exception {
        False isf = new False();
        assertFalse(isf.isOddNumber(3));

    }
}
