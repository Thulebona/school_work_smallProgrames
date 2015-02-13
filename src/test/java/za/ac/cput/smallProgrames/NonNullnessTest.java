package za.ac.cput.smallProgrames;

import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class NonNullnessTest extends TestCase{

    public void testIsNotNull() throws Exception {

        NonNullness nnn = new NonNullness();

        assertNotNull(nnn.isNotNull());
    }
}
