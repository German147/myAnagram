package com.myAnagram.stringMethod;

public class ReversingAString {
    public static void main(String[] args) {

        String x = "Luis German Barrera";
        //I crate an array to get to each element of the array
        char[] y = x.toCharArray();
        //Here I take the size of the array
        int size = y.length;
        //Here I create the new Array to be fulfilled
        char[] a = new char[size];

        //Here I create a flag int
        int i = 0;
        //while  int i is not as big as the array
        while (i != size) {
            //state the same element from one array to another.
            a[i] = y[size-i-1];
            //increment i to get the next element.
            i++;
        }
        System.out.println(a);
        System.out.println(y);
    }
}
