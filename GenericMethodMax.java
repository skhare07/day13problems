package com.bridgelabz.day13problems;

public class GenericMethodMax <T extends Comparable<T>> {
    private T x,y,z;
    //constructor
    public GenericMethodMax(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //checking max
    public static <T extends Comparable<T>> T MaxValue(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y; //y is max as for now
        if (z.compareTo(max) > 0)
            max = z;   //z is max now
        printMax(x, y, z, max);
        return max;
    }

    private static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("The max is :" + max);

    }

    public static void main(String[] args) {
        String x = "jack", y = "king", z = "queen";
        Integer a = 25, b = 24, c = 19;
        Float p = 1.23f, q = 2.2f, r = 0.2f;

        MaxValue(x,y,z);
        MaxValue(a,b,c);
        MaxValue(p,q,r);

    }
}
