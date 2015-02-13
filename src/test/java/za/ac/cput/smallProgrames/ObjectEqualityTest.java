package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class ObjectEqualityTest extends TestCase{
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testObjectEquality() throws Exception {

        ObjectEquality objE  = new ObjectEquality("Hadebe");
        ObjectEquality objE2 =  new ObjectEquality("Hadebe");

        assertSame(objE.getName(),objE2.getName());
    }
}
