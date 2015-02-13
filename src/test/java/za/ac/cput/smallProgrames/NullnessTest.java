package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class NullnessTest extends TestCase {

    @Test
    public void testIsNull() throws Exception {

        Nullness isN = new Nullness();

        assertNull(isN.isNull());

    }
}
