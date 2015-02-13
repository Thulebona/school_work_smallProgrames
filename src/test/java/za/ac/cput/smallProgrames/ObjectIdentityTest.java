package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class ObjectIdentityTest extends TestCase{

    @Test
    public void testNameIdentity() throws Exception {
        ObjectIdentity obj = new ObjectIdentity("Hello");
        ObjectIdentity obj2 = obj;

        assertSame(obj,obj2);

    }
}
