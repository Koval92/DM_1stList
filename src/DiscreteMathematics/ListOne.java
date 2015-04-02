package DiscreteMathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOne {
    public static int floor(double number)
    {
        return (number >= 0) ? (int) number : ((int) number - 1);
    }

    public static int ceiling(double number)
    {
        if(number == (int) number)
            return (int) number;
        return (number >=0) ? (int) number + 1 : (int) number;
    }

    public static int modulo(int a, int d)
    {
        return a-d*floor(a/d);
    }

    public static double fractionalPart(double number)
    {
        return number - floor(number);
    }

    public static List<Integer> GeneratePrimes(int k, int count) {
        ArrayList<Integer> primes = new ArrayList<>();

        boolean[] numbers = new boolean[count];
        numbers[0] = numbers[1] = false;
        for(int i = 2; i < count; i++)
            numbers[i] = true;
        for(int i = 2; i < count; i++)
        {
            if(numbers[i])
            {
                for(int j = 2*i; j < count; j += i)
                    numbers[j] = false;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i])
            {
                primes.add(i);
                if(primes.size() == k)
                    break;
            }
        }

        return primes;
    }

    public static boolean isPermutation(ArrayList<Integer> numbers)
    {
        for(int i=0; i<numbers.size(); i++)
        {
            for(int j=i+1; j<numbers.size(); j++)
            {
                if(numbers.get(i).equals(numbers.get(j)))
                    return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> generatePermutations(int range)
    {
        return new PermutationsGenerator(range).invoke();
    }

    private static class PermutationsGenerator {
        private int range;
        List<Integer> P;
        List<List<Integer>> permutations;

        public PermutationsGenerator(int range) {
            this.range = range;
            permutations = new ArrayList<>();
            P = new ArrayList<>();
        }

        public List<List<Integer>> invoke() {

            for(int i=1; i<=range; i++)
                P.add(i);
            perm(range);

            return permutations;
        }

        private void perm(int k)
        {
            if(k==1)
                permutations.add(new ArrayList<>(P));
            else
            {
                for(int i=1; i<=k; i++)
                {
                    Collections.swap(P, i - 1, k - 1);
                    perm(k - 1);
                    Collections.swap(P, i - 1, k - 1);
                }
            }
        }
    }

    public static void main(String[] t) {
         new MainWindow();
    }
}
