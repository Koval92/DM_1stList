package DiscreteMathematics;

public class ListOne {

    public static void main(String[] args) {
    }

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
}
