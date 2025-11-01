package com.floriskroeze;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        array[0] = 1;

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 1.0;

        int[] firstTen = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10};
        System.out.println("first = " + firstTen);
        int[] newArray;
        newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {

        }

        for (int item : newArray) {
            System.out.println(item);
        }

    }
}