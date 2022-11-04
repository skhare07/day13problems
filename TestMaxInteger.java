package com.bridgelabz.day13problems;

public class TestMaxInteger {

    //checking max of three integers
    public static Integer MaxInteger(Integer x , Integer y , Integer z ){
        Integer max = x;
        if(y.compareTo(max)>0)
            max=y; //y is max as for now
        if(z.compareTo(max)>0)
            max=z;   //z is max now
         printMax(x,y,z,max);
        return max;
    }

    private static void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.println("The max of three integer is :"+max);

    }

    public static void main(String[] args) {
        Integer x = 100 , y = 20 ,z = 40;
        MaxInteger(x,y,z);
    }
}
