package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
@Ignore
public class DisablingTest extends TestCase {


    public void testNumber() throws Exception {
        Disabling ds= new Disabling();
        assertEquals(4,ds.number());

    }
}
