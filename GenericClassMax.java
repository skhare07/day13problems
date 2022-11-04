package com.bridgelabz.day13problems;


public class GenericClassMax<T extends Comparable<T>> {
    private T x, y, z;

    //constructor
    public GenericClassMax(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }


    //checking max
    public static <T extends Comparable<T>> T MaxValue(T x, T y, T z) {
        T max = x;//initialising x as greater
        if (y.compareTo(max) > 0)
            max = y;//as of now y is greater

        if (z.compareTo(max) > 0)
            max = z;//now z is greater
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

        GenericClassMax<String> genericClassMax = new GenericClassMax(x, y, z);
        GenericClassMax<Float> genericClassMax1 = new GenericClassMax(p, q, r);
        GenericClassMax<Integer> genericClassMax2 = new GenericClassMax(a, b, c);

        System.out.println(genericClassMax.MaxValue(x, y, z));
        System.out.println(genericClassMax1.MaxValue(p, q, r));
        System.out.println(genericClassMax2.MaxValue(a, b, c));


//        GenericClassMax.<String>MaxValue(x, y, z);
//        GenericClassMax.<Integer>MaxValue(a, b, c);
//        GenericClassMax.<Float>MaxValue(p, q, r);

    }
}
