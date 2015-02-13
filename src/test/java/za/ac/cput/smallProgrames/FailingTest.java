package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class FailingTest extends TestCase {

    @Test
    public void testTestFailing() throws Exception {
        Failing fl = new Failing();

       Assert.assertEquals(5,fl.testFailing());
       fail("fail even though i don't get it why");
    }

}
