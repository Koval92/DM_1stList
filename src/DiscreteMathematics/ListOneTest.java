package DiscreteMathematics;

import org.junit.Assert;
import org.junit.Test;

public class ListOneTest {
    static final double eps = 0.001;
    @Test
    public void testFloor() throws Exception {
        Assert.assertEquals(1, ListOne.floor(1.5));
        Assert.assertEquals(2, ListOne.floor(2));
        Assert.assertEquals(0, ListOne.floor(0));
        Assert.assertEquals(-1, ListOne.floor(-0.5));
        Assert.assertEquals(-3, ListOne.floor(-2.1));
    }

    @Test
    public void testCeiling() throws Exception {
        Assert.assertEquals(3, ListOne.ceiling(2.5));
        Assert.assertEquals(0, ListOne.ceiling(0));
        Assert.assertEquals(0, ListOne.ceiling(-0.4));
        Assert.assertEquals(-3, ListOne.ceiling(-3.4));
    }

    @Test
    public void testFractionalPart() throws Exception {
        Assert.assertEquals(0.567, ListOne.fractionalPart(2.567), eps);
        Assert.assertEquals(0, ListOne.fractionalPart(3.0), eps);
        Assert.assertEquals(0.77, ListOne.fractionalPart(-4.23), eps);
    }

    @Test
    public void testModulo() throws Exception {
        Assert.assertEquals(4, ListOne.modulo(11, 7));
        Assert.assertEquals(0, ListOne.modulo(8, 4));
    }
}