package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class IntegersTest extends TestCase {

    @Test
    public void testGetInt() throws Exception {

        Integers gnt = new Integers();
        assertEquals(5,gnt.getInt());
    }
}
