package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TruthTest extends TestCase {

    @Test
    public void testIsEvenNumber() throws Exception {

        Truth  isEvn = new Truth();

        assertTrue(isEvn.isEvenNumber(8));
    }
}
