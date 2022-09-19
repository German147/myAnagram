package com.myAnagram.stringMethod;

public class InsertingStringIntoAnArray {
    public static void main(String[] args) {

        String x = "Luis German Barrera";
        char[] y = x.toCharArray();
        int size = y.length;
        char[] a = new char[size];


        int i = 0;
        while (i!=size){
            a[i] = y[i];
            i++;
        }
        System.out.println(a);
        System.out.println(y);
    }
}
