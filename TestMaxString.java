package com.bridgelabz.day13problems;

public class TestMaxString {

    //checking max of three String values
    public static String MaxString(String x , String y , String z ){
        String max = x;
        if(y.compareTo(max)>0)
            max=y; //y is max as for now

        if(z.compareTo(max)>0)
            max=z; //z is max

        printMax(max);
        return max;
    }

    private static void printMax( String max) {
        System.out.println("The max is :"+max);

    }

    public static void main(String[] args) {
        String x = "jack" , y ="john" ,z = "jimmy";
        MaxString(x,y,z);
    }
}
