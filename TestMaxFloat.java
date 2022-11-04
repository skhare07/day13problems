package com.bridgelabz.day13problems;

public class TestMaxFloat {

    //checking max of three Float values
    public static Float MaxFloat(Float x , Float y , Float z ){
        Float max = x;
        if(y.compareTo(max)>0)
            max=y; //y is max as for now
        if(z.compareTo(max)>0)
            max=z; //z is max
        printMax(max);
        return max;
    }

    private static void printMax( Float max) {
        System.out.println("The max of three float is :"+max);

    }

    public static void main(String[] args) {
        Float x = 10.33f , y = 20.27f ,z = 40.12f;
        MaxFloat(x,y,z);
    }
}
