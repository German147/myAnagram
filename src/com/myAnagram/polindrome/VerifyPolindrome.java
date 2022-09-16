package com.myAnagram.polindrome;

public class VerifyPolindrome {
    public static void main(String[] args) {

        String x = "liril";
        //I generate an array of char from my input stored in "x".
        char y[] = x.toCharArray();
        //I get the lenght using the char y[].
        int size = y.length;
        //I generate a new char with the lengh of the input.
        char a[] = new char[size];

        int i = 0;
        while (i!=size){
            a[size-1-i] = y[i];
            ++i;
        }

        i=0;
        while (i!=size){
            if (a[i]!=y[i]){
                System.out.println("Not a Polindrome");
                System.exit(0);
            }else {
                ++i;
                continue;
            }
        }
        System.out.println("It is a Polindrome");
    }
}
