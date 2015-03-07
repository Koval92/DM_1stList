package DiscreteMathematics;

import java.util.ArrayList;
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
        ArrayList<Integer> primes = new ArrayList<Integer>();

        boolean[] numbers = new boolean[count];

        numbers[0] = numbers[1] = false;
        for(int i = 2; i < count; i++)
            numbers[i] = true;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i])
            {
                for (int j = i + 1; j < numbers.length; j++)
                {
                    if (numbers[j])
                        numbers[j] = (j % i != 0);
                }
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
}
