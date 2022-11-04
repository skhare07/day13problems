package com.bridgelabz.day13problems;

public class GenericMethodUC4 <T extends Comparable<T>> {
    private T x,y,z;
    //constructor
    public GenericMethodUC4(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //checking max
    public static<T extends Comparable<T>> T maxValue(T...values){
        T max=values[0];
        for(int i =1;i<values.length;i++){
            if(values[i].compareTo(max)>0){
                max=values[i];
            }
        }
        System.out.println("the maximum of");
        for(int i =0;i<values.length;i++){
            System.out.print(values[i]+"\t");
        }
        printMax(max);
        return max;
    }
    public static <T>void printMax(T max){
        System.out.println("is\t"+max);
    }

    public static void main(String[] args) {
        String x = "jack", y = "king", z = "queen";
        Integer a = 25, b = 24, c = 19;
        Float p = 1.23f, q = 2.2f, r = 0.2f;

        GenericMethodUC4.<String>maxValue(x,y,z);
        GenericMethodUC4.<Integer>maxValue(a,b,c);
        GenericMethodUC4.<Float>maxValue(p,q,r);


    }
}