package za.ac.cput.smallProgrames;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class ArraysContentTest extends TestCase {

    @Test
    public void testAContent() throws Exception {

        ArraysContent ac = new ArraysContent();
        char[] list = {'a','b','c','d','e'};

        Assert.assertArrayEquals(list ,ac.aContent());
    }
}
