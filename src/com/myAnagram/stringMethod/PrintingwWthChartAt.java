package com.myAnagram.stringMethod;

public class PrintingwWthChartAt {
    public static void main(String[] args) {
        String x = "Luis German Barrera";
        // System.out.println(x.length());

        x = x.concat("\0");
        char[] d = x.toCharArray();
        int count = 0;
        int i = 0;

       while (d[i]!='\0'){
           ++count;
           ++i;
       }
        System.out.println(count);
    }
}
