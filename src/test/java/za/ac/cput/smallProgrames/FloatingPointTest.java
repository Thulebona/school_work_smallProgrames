package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class FloatingPointTest extends TestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testFltPoint() throws Exception {

        FloatingPoint flt = new FloatingPoint();
        assertEquals(1.24f, flt.fltPoint());
    }

}
