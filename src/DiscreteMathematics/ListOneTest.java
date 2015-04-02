package DiscreteMathematics;

import org.junit.Assert;
import org.junit.Test;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOneTest {
    private static final double eps = 0.001;
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

    @Test
    public void testGeneratePrimes() throws Exception {
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> generatedPrimes = ListOne.GeneratePrimes(5, 15);

        Assert.assertEquals(expectedPrimes.size(), generatedPrimes.size());
        Assert.assertTrue(generatedPrimes.equals(expectedPrimes));
    }

    @Test
    public void testIfPermutation() throws Exception {
        Assert.assertTrue(ListOne.isPermutation(new ArrayList<>(Arrays.asList(1, 2, 3))));
        Assert.assertTrue(ListOne.isPermutation(new ArrayList<>(Arrays.asList(3, 2, 1))));

        Assert.assertFalse(ListOne.isPermutation(new ArrayList<>(Arrays.asList(1, 2, 1))));
        Assert.assertFalse(ListOne.isPermutation(new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 8))));
    }

    @Test
    public void testGeneratePermutations() throws Exception {
        List<List<Integer>> permutations;

        permutations = ListOne.generatePermutations(2);
        Assert.assertTrue(permutations.size() == 2);
        Assert.assertTrue(isDistinct(permutations));
        //printPermutations(permutations);

        permutations = ListOne.generatePermutations(3);
        Assert.assertTrue(permutations.size() == 6);
        Assert.assertTrue(isDistinct(permutations));
        //printPermutations(permutations);

        permutations = ListOne.generatePermutations(7);
        Assert.assertTrue(permutations.size() == 5040);
        Assert.assertTrue(isDistinct(permutations));
        //printPermutations(permutations);
    }

    public void printPermutations(List<List<Integer>> perms)
    {
        System.out.println("Permutations:");
        for(List<Integer> perm : perms)
            System.out.println(perm);
        System.out.println();
    }

    public boolean isDistinct(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                    return false;
            }
        }
        return true;
    }
}