package Example_2;

import org.junit.Test;
import junit.framework.Assert;

public class MathTest {
    @Test
    public void testEquals() {
        Assert.assertEquals(4, 2 + 2);
        Assert.assertTrue(4 == 2 + 2);
    }

    @Test
    public void testNotEquals() {
        Assert.assertFalse(5 == 2 + 2);
    }
}

