package com.myAnagram.stringMethod;

public class PrintingwWthChartAt {
    public static void main(String[] args) {
        String x = "Luis German Barrera";
       // System.out.println(x.length());

        char[] d = x.toCharArray();
        int count = 0;

        for (int i = 0; i < x.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
